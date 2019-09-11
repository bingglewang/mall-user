package com.zsl.malluserapi.controller;

import com.zsl.malluserapi.service.AddressService;
import com.zsl.mallusercommon.CommonResult;
import com.zsl.malluserdb.po.UserAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;
import java.util.List;

@RestController
@RequestMapping("address")
public class UserAddressController {
    @Autowired
    private AddressService addressService;

    /**
     * 用户收货地址列表
     *
     * @param userId 用户ID
     * @return 收货地址列表
     */
    @GetMapping("list")
    public CommonResult list(Integer userId) {
        if (userId == null) {
            return CommonResult.failed("用户id不能为空");
        }
        List<UserAddress> addressList = addressService.queryByUid(userId);
        return CommonResult.success(addressList);
    }

    /**
     * 收货地址详情
     *
     * @param userId 用户ID
     * @param id     收货地址ID
     * @return 收货地址详情
     */
    @GetMapping("detail")
    public CommonResult detail(Integer userId, @NotNull Integer id) {
        if (userId == null) {
            return  CommonResult.failed("用户id不能为空");
        }

        UserAddress address = addressService.query(userId, id);
        if (address == null) {
            return CommonResult.failed("参数错误");
        }
        return CommonResult.success(address);
    }

    private CommonResult validate(UserAddress address) {
        String name = address.getConsignee();
        if (StringUtils.isEmpty(name)) {
            return CommonResult.validateFailed("签收人不能为空");
        }
        // 测试收货手机号码是否正确
        String mobile = address.getMobile();
        if (StringUtils.isEmpty(mobile)) {
            return  CommonResult.validateFailed("手机号不能为空");
        }
       /* if (!RegexUtil.isMobileExact(mobile)) {
            return CommonResult.validateFailed("手机号格式不正确");
        }*/
        String province = address.getProvinceId();
        if (StringUtils.isEmpty(province)) {
            return CommonResult.validateFailed("省份代码不能为空");
        }
        String city = address.getCityId();
        if (StringUtils.isEmpty(city)) {
            return CommonResult.validateFailed("城市代码不能为空");
        }
        String county = address.getCountryId();
        if (StringUtils.isEmpty(county)) {
            return CommonResult.validateFailed("国家代码不能为空");
        }
        String areaCode = address.getDistrictId();
        if (StringUtils.isEmpty(areaCode)) {
            return CommonResult.validateFailed("区县代码不能为空");
        }
        String detailedAddress = address.getAddress();
        if (StringUtils.isEmpty(detailedAddress)) {
            return CommonResult.validateFailed("详细地址不能为空");
        }
        Boolean isDefault = address.getIsDefault();
        if (isDefault == null) {
            return CommonResult.validateFailed("是否默认不能为空");
        }
        return null;
    }

    /**
     * 添加或更新收货地址
     *
     * @param userId  用户ID
     * @param address 用户收货地址
     * @return 添加或更新操作结果
     */
    @PostMapping("save")
    public CommonResult save(Integer userId, @RequestBody UserAddress address) {
        if (userId == null) {
            return  CommonResult.failed("用户id不能为空");
        }
        CommonResult error = validate(address);
        if (error != null) {
            return error;
        }

        if (address.getIsDefault()) {
            // 重置其他收获地址的默认选项
            addressService.resetDefault1(userId);
        }

        if (address.getId() == null || address.getId().equals(0)) {
            address.setId(null);
            address.setMemberId(userId);
            addressService.add(address);
        } else {
            address.setMemberId(userId);
            if (addressService.update(address) == 0) {
                return CommonResult.failed("更新失败");
            }
        }
        return CommonResult.success(address.getId());
    }

    /**
     * 设置默认地址
     *
     * @param userId  用户ID
     * @param id 地址ID
     * @return 设置默认地址
     */
    @PostMapping("resetDefault")
    public CommonResult resetDefault(Integer userId, Integer id) {
        if (userId == null) {
            return  CommonResult.failed("用户id不能为空");
        }
        if (id == null) {
            return  CommonResult.failed("地址id不能为空");
        }
        addressService.resetDefault(userId,id);
        return CommonResult.success("默认地址设置成功");
    }

    /**
     * 删除收货地址
     *
     * @param userId  用户ID
     * @param id 用户收货地址，{ id: xxx }
     * @return 删除操作结果
     */
    @PostMapping("delete")
    public CommonResult delete(Integer userId, Integer id) {
        if (userId == null) {
            return  CommonResult.failed("用户id不能为空");
        }
        if (id == null) {
            return CommonResult.failed("地址id不能为空");
        }

        addressService.delete(id);
        return CommonResult.success("删除成功");
    }
}
