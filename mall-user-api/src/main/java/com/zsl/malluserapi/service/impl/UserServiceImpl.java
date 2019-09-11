package com.zsl.malluserapi.service.impl;

import com.zsl.malluserapi.dao.UserDao;
import com.zsl.malluserapi.dto.user.in.UserLoginParam;
import com.zsl.malluserapi.dto.user.in.UserRegisterParam;
import com.zsl.malluserapi.dto.user.in.UserUpdateParam;
import com.zsl.malluserapi.service.UserService;
import com.zsl.malluserapi.util.DigestUtil;
import com.zsl.malluserdb.mapper.UserFriendMapper;
import com.zsl.malluserdb.mapper.UserMemberMapper;
import com.zsl.malluserdb.po.UserFriend;
import com.zsl.malluserdb.po.UserFriendExample;
import com.zsl.malluserdb.po.UserMember;
import com.zsl.malluserdb.po.UserMemberExample;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;
import org.springframework.util.CollectionUtils;

import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {
//    @Autowired
//    private RedisService redisService;

    @Autowired
    private UserMemberMapper userMemberMapper;

    @Autowired
    private UserFriendMapper userFriendMapper;

    @Autowired
    private UserDao userDao;

    private final String REDIS_PREFIX = "message";

    @Override
    public int register(UserRegisterParam registerParam) {
        //判断手机号是否被注册过
        UserMemberExample userMemberExample = new UserMemberExample();
        userMemberExample.or().andMobileEqualTo(registerParam.getMobile());
        UserMember userMember = userMemberMapper.selectOneByExample(userMemberExample);
        if (userMember != null) {
            return -1; //该手机号已经被注册
        }
        // 判断验证码是否正确
//        String redisCode = redisService.get(REDIS_PREFIX+registerParam.getMobile());
//        if(!(registerParam.getCode()).equals(redisCode)){
//           return -2; //验证码错误
//        }
        //插入用户
        UserMember insert = new UserMember();
        BeanUtils.copyProperties(registerParam, insert);
        //密码加密处理
        insert.setPassword(DigestUtil.md5Degist(insert.getPassword()));
        //生成分享码
        String shareid = UUID.randomUUID() + "";
        shareid = shareid.replace("-","");
        insert.setShareId(shareid);
        //用户默认信息
        insert.setNickname(insert.getMobile());
        insert.setRealname(insert.getMobile());
        insert.setPicUrl("https://zs-1256645015.cos.ap-guangzhou.myqcloud.com/trace/2019/6/23/109353ea-b855-4401-bb4a-1813c20016b4.svg");
        int i = userMemberMapper.insertSelective(insert);
        if (i <= 0)
            return -3;//插入失败
        return 1;
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int shareRegister(String shareId, UserRegisterParam registerParam,HttpServletRequest request) {
        //用户openid
        String openid = request.getParameter("openid");
        UserMemberExample userMemberExamplewx = new UserMemberExample();
        UserMemberExample.Criteria criteriawx = userMemberExamplewx.createCriteria();
        criteriawx.andOpenIdEqualTo(openid);
        List<UserMember> userMemberListwx = userMemberMapper.selectByExample(userMemberExamplewx);
        if(!(CollectionUtils.isEmpty(userMemberListwx))){
            return -6; //该微信已经注册和绑定
        }
        int rollId = 0;//用户回滚
        //判断手机号是否被注册过
        UserMemberExample userMemberExample = new UserMemberExample();
        userMemberExample.or().andMobileEqualTo(registerParam.getMobile());
        UserMember userMember = userMemberMapper.selectOneByExample(userMemberExample);
        if (userMember != null) {
            return -1; //该手机号已经被注册
        }
        // 判断验证码是否正确
//          String redisCode = redisService.get(REDIS_PREFIX + registerParam.getMobile());
//          if (!(registerParam.getCode()).equals(redisCode)) {
//              return -2; //验证码错误
//          }
        //判断分享人是否存在
        UserMemberExample shareMemberExample = new UserMemberExample();
        shareMemberExample.or().andShareIdEqualTo(shareId);
        UserMember shareMember = userMemberMapper.selectOneByExample(shareMemberExample);
        if (shareMember == null) {
            return -3; //分享人不存在
        }
        try {
            //向会员表里插入记录
            UserMember insert = new UserMember();
            BeanUtils.copyProperties(registerParam, insert);
            //密码加密处理
            insert.setPassword(DigestUtil.md5Degist(insert.getPassword()));
            //生成分享码
            //生成分享码
            String shareid = UUID.randomUUID() + "";
            shareid = shareid.replace("-","");
            insert.setShareId(shareid);
            //用户默认信息
            if(StringUtils.isNoneBlank(openid)){
                insert.setOpenId(openid);
            }
            insert.setNickname(insert.getMobile());
            insert.setRealname(insert.getMobile());
            insert.setPicUrl("https://zs-1256645015.cos.ap-guangzhou.myqcloud.com/trace/2019/6/23/109353ea-b855-4401-bb4a-1813c20016b4.svg");
            int i = userMemberMapper.insertSelective(insert);
            if (i <= 0)
                return -4;//插入失败
            //在朋友表里面插入记录
            UserFriend userFriend = new UserFriend();
            userFriend.setFriendId(insert.getId()); //注册人
            rollId = insert.getId();
            userFriend.setUserId(shareMember.getId());// 分享人
            UserFriend userFriend1 = userDao.getByFriendId(shareMember.getId());
            if(userFriend1 == null){
                userFriend.setTree(shareMember.getShareId()+"/"+insert.getShareId());
            }else{
                userFriend.setTree(userFriend1.getTree()+"/"+insert.getShareId());
            }
            userFriend.setCreateTime(new Date());
            userFriend.setMobile(insert.getMobile());
            int j = userFriendMapper.insert(userFriend);
            if (j <= 0) {
                return -5;//朋友插入失败
            }
            return 1;
        } catch (Exception e) {
            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly(); //手动开启事务回滚
            userMemberMapper.deleteByPrimaryKey(rollId);
            return -4;
        }
    }

    @Override
    public int login(UserLoginParam loginParam) {
        //判断手机号是否被注册过
        UserMemberExample userMemberExample = new UserMemberExample();
        userMemberExample.or().andMobileEqualTo(loginParam.getMobile());
        UserMember userMember = userMemberMapper.selectOneByExample(userMemberExample);
        if (userMember == null) {
            return -1; //该手机号还没注册
        }
        //判断密码是否相同
        String passwordEncode = DigestUtil.md5Degist(loginParam.getPassword());
        if (!passwordEncode.equals(userMember.getPassword())) {
            return -2;//密码错误
        }
        return userMember.getId();
    }

    @Override
    public int reset(UserRegisterParam registerParam) {
        //判断手机号是否被注册过
        UserMemberExample userMemberExample = new UserMemberExample();
        userMemberExample.or().andMobileEqualTo(registerParam.getMobile());
        UserMember userMember = userMemberMapper.selectOneByExample(userMemberExample);
        if (userMember == null) {
            return -1; //用户不存在
        }
        // 判断验证码是否正确
//        String redisCode = redisService.get(REDIS_PREFIX+registerParam.getMobile());
//        if(!(registerParam.getCode()).equals(redisCode)){
//            return -2; //验证码错误
//        }
        //重置用户密码
        UserMember insert = new UserMember();
        //密码加密处理
        insert.setId(userMember.getId());
        insert.setPassword(DigestUtil.md5Degist(registerParam.getPassword()));
        int i = userMemberMapper.updateByPrimaryKeySelective(insert);
        if (i <= 0)
            return -3;//密码重置失败
        return 1;
    }

    @Override
    public UserMember userDetail(Integer userId) {
        return userMemberMapper.selectByPrimaryKey(userId);
    }

    @Override
    @Transactional(rollbackFor = Exception.class)
    public int update(UserUpdateParam updateParam) {
        UserMember updateMember = new UserMember();
        BeanUtils.copyProperties(updateParam,updateMember);
        if(StringUtils.isBlank(updateMember.getPassword())){
            updateMember.setPassword(null);
        }else{
            updateMember.setPassword(DigestUtil.md5Degist(updateMember.getPassword()));
        }
        int i = userMemberMapper.updateByPrimaryKeySelective(updateMember);
        if(i <= 0){
            return -1; //更新失败
        }
        //修改朋友表信息
        UserFriendExample friendExample = new UserFriendExample();
        friendExample.or().andFriendIdEqualTo(updateMember.getId());
        UserFriend friend = userFriendMapper.selectOneByExample(friendExample);
        if(friend != null){
            UserFriend updateFriend = new UserFriend();
            updateFriend.setId(friend.getId());
            updateFriend.setNickName(updateMember.getNickname()); //昵称
            updateFriend.setPhoto(updateMember.getPicUrl()); //头像
            userFriendMapper.updateByPrimaryKeySelective(updateFriend);
        }
        return 1;
    }

    @Override
    public int moveFriend(Integer moveUserId, Integer targetUserId) {
        UserMember userMember = userMemberMapper.selectByPrimaryKey(moveUserId);
        if(userMember == null){
            return -1;//移动用户不存在
        }
        if(!hasParent(moveUserId)){
            UserFriend insertFriend = new UserFriend();
            insertFriend.setUserId(targetUserId);
            insertFriend.setFriendId(moveUserId);
            insertFriend.setNickName(userMember.getNickname()); //昵称
            insertFriend.setPhoto(userMember.getPicUrl()); //头像
            insertFriend.setCreateTime(new Date());
            insertFriend.setMobile(userMember.getMobile());
            //当B没有下级
            UserFriend userFriend1 = userDao.getByFriendId(targetUserId);
            String replaceShareId = "";
            if(userFriend1 == null){
                UserMember userMember1 = userMemberMapper.selectByPrimaryKey(targetUserId);
                insertFriend.setTree(userMember1.getShareId()+"/"+userMember.getShareId());
                replaceShareId = userMember1.getShareId();
            }else{
                insertFriend.setTree(userFriend1.getTree()+"/"+userMember.getShareId());
                replaceShareId = userFriend1.getTree();
            }
            userFriendMapper.insertSelective(insertFriend);

            //当B没有上级
            if(hasChildren(moveUserId)){
                //当B有下级(修改子孙链路)
                recursionShareUpdate(userMember.getShareId(),replaceShareId);
            }
        }else{
            //拿到b的上级
            UserFriend friendParent = userDao.getByFriendId(moveUserId);
            String friendParentShare = friendParent.getTree();
            //将b的上级替换成a
            UserFriend userFriend1 = userDao.getByFriendId(targetUserId);
            String replaceShareId = "";
            if(userFriend1 == null){
                UserMember userMember1 = userMemberMapper.selectByPrimaryKey(targetUserId);
                replaceShareId = userMember1.getShareId();
            }else{
                replaceShareId = userFriend1.getTree();
            }
            UserFriend updateFriend = new UserFriend();
            UserFriend userFriend2 = userDao.getByFriendId(moveUserId);
            updateFriend.setId(userFriend2.getId());
            String treeTarget = (userFriend2.getTree()).replace(friendParentShare,replaceShareId);
            updateFriend.setTree(treeTarget+"/"+userMember.getShareId());
            updateFriend.setUserId(targetUserId);
            userFriendMapper.updateByPrimaryKeySelective(updateFriend);
            //当B有上级
            if(hasChildren(moveUserId)){
                //当B有下级
                recursionShareUpdate(friendParentShare,replaceShareId);
            }
        }
        return 1;
    }

    /**
     * 判断是否有上级
     * @param userId
     * @return
     */
    public boolean hasParent(Integer userId){
        UserFriendExample friendExample = new UserFriendExample();
        friendExample.or().andFriendIdEqualTo(userId);
        List<UserFriend> friend = userFriendMapper.selectByExample(friendExample);
        if(CollectionUtils.isEmpty(friend))
            return false;
        return true;
    }

    /**
     * 判断是否有下级
     * @param userId
     * @return
     */
    public boolean hasChildren(Integer userId){
        UserFriendExample friendExample = new UserFriendExample();
        friendExample.or().andUserIdEqualTo(userId);
        List<UserFriend> friend = userFriendMapper.selectByExample(friendExample);
        if(CollectionUtils.isEmpty(friend))
            return false;
        return true;
    }

    /**
     * 修改用户的子孙链路信息
     * @param moveShareId(查询包含此分享码的所有记录)
     * @param replaceShareId
     */
    public void recursionShareUpdate(String moveShareId,String replaceShareId){
        List<UserFriend> friendList =  userDao.getFriendListByTree(moveShareId);
        for(UserFriend userFriend : friendList){
            UserFriend updateTree = new UserFriend();
            updateTree.setId(userFriend.getId());
            String tree = userFriend.getTree();
            tree = tree.substring(tree.indexOf(moveShareId));
            String tem = tree.replace(moveShareId,replaceShareId);
            updateTree.setTree(tem);
            userFriendMapper.updateByPrimaryKeySelective(updateTree);
        }
    }
}
