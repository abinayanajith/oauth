package com.abi.configConsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class ProfileConfig {

    @Autowired
    Environment environment;

    public String getRentRoomMin(){
        return environment.getProperty("rent.room.min");
    }

    //spring bean naming convention for getters and setters?
//    public String getMinRentPeriod(){
//        return environment.getProperty();
//    }
}
