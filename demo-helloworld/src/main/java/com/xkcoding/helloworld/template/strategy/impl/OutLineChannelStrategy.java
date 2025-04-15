package com.xkcoding.helloworld.template.strategy.impl;

import com.xkcoding.helloworld.po.UserBaseInfoRegisterVO;
import com.xkcoding.helloworld.template.strategy.ChannelStrategy;
import org.springframework.stereotype.Component;

// manager渠道策略
@Component("outLineChannelStrategy")
public class OutLineChannelStrategy implements ChannelStrategy {
    @Override
    public void processLoanApplication(UserBaseInfoRegisterVO request) {
        System.out.println("Processing loan application for outline platform...");
        // manager的具体逻辑...
    }
}
