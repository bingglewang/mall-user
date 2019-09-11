package com.zsl.malluserapi.service;

public interface WxService {
    /**
     * 使用微信jssdk
     * @return
     */
    Object createSignature(String webUrl);
}
