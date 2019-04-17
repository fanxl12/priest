package com.little.g.user.service;

import com.github.scribejava.core.oauth.OAuth20Service;
import com.little.g.user.BaseTest;
import org.junit.Test;

import javax.annotation.Resource;

/**
 * Created by lengligang on 2019/4/16.
 */
public class OAuth2ServiceTest  extends BaseTest{

    @Resource
    private OAuth20Service oAuth20Service;


    @Test
    public void testGetCode(){
        String aurl=oAuth20Service.createAuthorizationUrlBuilder()
                .scope("snsapi_userinfo").build();
        System.out.print(aurl);
    }

    @Test
    public void testToken(){
    }
}
