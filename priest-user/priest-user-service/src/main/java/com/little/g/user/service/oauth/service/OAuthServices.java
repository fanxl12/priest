package com.little.g.user.service.oauth.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class OAuthServices {
    
    @Autowired
    List<CustomOAuthService> customOAuthServiceList;
    
    public CustomOAuthService getOAuthService(String type){
        Optional<CustomOAuthService> oAuthService = customOAuthServiceList.stream().filter(o -> o.getoAuthType().equals(type))
                .findFirst();
        if(oAuthService.isPresent()){
            return oAuthService.get();
        }
        return null;
    }


}