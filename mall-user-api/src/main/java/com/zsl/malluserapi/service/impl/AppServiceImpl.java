package com.zsl.malluserapi.service.impl;

import com.zsl.malluserapi.dto.app.in.AppInParam;
import com.zsl.malluserapi.dto.app.out.AppOutParam;
import com.zsl.malluserapi.service.AppService;
import com.zsl.malluserdb.mapper.AppVersionMapper;
import com.zsl.malluserdb.po.AppVersion;
import com.zsl.malluserdb.po.AppVersionExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;

import java.util.List;

@Service
public class AppServiceImpl implements AppService {
    @Autowired
    private AppVersionMapper appVersionMapper;

    @Override
    public Object getAppUpdate(AppInParam appInParam) {
        AppOutParam result = new AppOutParam();
        //不需要更新
        result.setStatus(0);
        //查询数据库最新版本信息
        AppVersionExample appVersionExample = new AppVersionExample();
        appVersionExample.orderBy("create_time desc");
        List<AppVersion> appVersionList = appVersionMapper.selectByExample(appVersionExample);
        if(!CollectionUtils.isEmpty(appVersionList)){
            //判断前端上传的版本信息，是否需要更新
            if(appVersionList.get(0).getAppId().equals(appInParam.getAppid())){
                if(appVersionList.get(0).getAppVersion().equals(appInParam.getVersion())){
                }else{
                    result.setStatus(1);
                    result.setNote(appVersionList.get(0).getAppNote());
                    result.setUrl(appVersionList.get(0).getAppUrl());
                }
            }else{
                return "appID错误";
            }
        }
        return result;
    }
}
