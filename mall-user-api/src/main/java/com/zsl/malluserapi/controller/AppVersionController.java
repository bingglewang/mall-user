package com.zsl.malluserapi.controller;

import com.zsl.malluserapi.dto.app.in.AppInParam;
import com.zsl.malluserapi.service.AppService;
import com.zsl.mallusercommon.CommonResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("appVersion")
public class AppVersionController {
    @Autowired
    private AppService appService;

    /**
     * 获取版本判断是否需要更新
     * @param appVersion
     * @return
     */
    @PostMapping("update")
    public CommonResult getGoodsDetail(@RequestBody AppInParam appVersion){
        return CommonResult.success(appService.getAppUpdate(appVersion));
    }
}
