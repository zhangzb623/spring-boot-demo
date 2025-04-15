package com.xkcoding.helloworld.temp.s.impl;

import com.xkcoding.helloworld.temp.s.LoginStrategy;
import org.springframework.stereotype.Component;

@Component("channelBLoginStrategy")
public class ChannelBLoginStrategy implements LoginStrategy {
    @Override
    public void login() {
        System.out.println("Executing login for Channel B");
    }
}
