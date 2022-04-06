package com.abi.configConsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileController {

    @Autowired
    ProfileConfig profileConfig;

    @RequestMapping(value = "/profile")
    public ProfileConfig getProfileConfig(){
        return profileConfig;
    }
}
