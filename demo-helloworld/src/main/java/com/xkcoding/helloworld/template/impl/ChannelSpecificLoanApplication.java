package com.xkcoding.helloworld.template.impl;

import com.xkcoding.helloworld.po.UserBaseInfoRegisterVO;
import com.xkcoding.helloworld.template.UserBaseLoginTemplate;
import com.xkcoding.helloworld.template.strategy.ChannelStrategy;

public class ChannelSpecificLoanApplication extends UserBaseLoginTemplate {
    private final ChannelStrategy channelStrategy;

    // 构造函数注入策略
    public ChannelSpecificLoanApplication(ChannelStrategy loanStrategy) {
        this.channelStrategy = loanStrategy;
    }

    @Override
    protected void processLoanApplication(UserBaseInfoRegisterVO request) {
        // 调用策略模式的具体实现
        channelStrategy.processLoanApplication(request);
    }
}
