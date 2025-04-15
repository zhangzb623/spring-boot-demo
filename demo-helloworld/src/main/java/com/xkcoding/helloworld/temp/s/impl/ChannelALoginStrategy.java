package com.xkcoding.helloworld.temp.s.impl;

import com.xkcoding.helloworld.temp.s.LoginStrategy;
import org.springframework.stereotype.Component;

@Component("channelALoginStrategy")
public class ChannelALoginStrategy implements LoginStrategy {
    @Override
    public void login() {
        System.out.println("Executing login for Channel A");
    }
}
