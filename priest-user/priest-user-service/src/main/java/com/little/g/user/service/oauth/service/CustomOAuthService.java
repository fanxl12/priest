package com.little.g.user.service.oauth.service;

import com.github.scribejava.core.model.OAuth2AccessToken;
import com.little.g.user.model.OAuthUser;

/**
 * Created by lengligang on 2019/4/16.
 */
public interface CustomOAuthService{
    /**
     * 获取类型
     * @return
     */
    String getoAuthType();

    /**
     * 获取URL
     * @return
     */
    String getAuthorizationUrl();

    /**
     * 获取用户信息
     * @param accessToken
     * @return
     */
    OAuthUser getOAuthUser(OAuth2AccessToken accessToken);

}