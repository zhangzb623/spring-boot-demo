package com.xkcoding.helloworld.template.strategy.impl;

import com.xkcoding.helloworld.po.UserBaseInfoRegisterVO;
import com.xkcoding.helloworld.template.strategy.ChannelStrategy;
import org.springframework.stereotype.Component;

@Component("defaultChannelStrategy")
public class DefaultChannelStrategy implements ChannelStrategy {
    @Override
    public void processLoanApplication(UserBaseInfoRegisterVO request) {
        System.out.println("Processing loan application with default strategy...");
        // 默认逻辑...
    }
}
