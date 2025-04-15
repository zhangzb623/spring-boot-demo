package com.xkcoding.helloworld.template.strategy.impl;

import com.xkcoding.helloworld.po.UserBaseInfoRegisterVO;
import com.xkcoding.helloworld.template.strategy.ChannelStrategy;
import org.springframework.stereotype.Component;

// 银行渠道策略
@Component("loanChannelStrategy")
public class LoanChannelStrategy implements ChannelStrategy {
    @Override
    public void processLoanApplication(UserBaseInfoRegisterVO request) {
        System.out.println("Processing loan application for loan channel...");
        // 银行渠道的具体逻辑...
    }
}
