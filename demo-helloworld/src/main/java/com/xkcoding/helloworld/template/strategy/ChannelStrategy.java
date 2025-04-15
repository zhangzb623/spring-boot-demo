package com.xkcoding.helloworld.template.strategy;


import com.xkcoding.helloworld.po.UserBaseInfoRegisterVO;

// 策略接口
public interface ChannelStrategy {
    void processLoanApplication(UserBaseInfoRegisterVO request);
}
