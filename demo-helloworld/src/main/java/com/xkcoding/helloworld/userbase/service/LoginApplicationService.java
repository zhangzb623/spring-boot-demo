package com.xkcoding.helloworld.userbase.service;

import com.xkcoding.helloworld.po.AjaxResult;
import com.xkcoding.helloworld.po.UserBaseInfoRegisterVO;
import com.xkcoding.helloworld.template.UserBaseLoginTemplate;
import com.xkcoding.helloworld.template.impl.ChannelSpecificLoanApplication;
import com.xkcoding.helloworld.template.strategy.ChannelStrategy;
import com.xkcoding.helloworld.template.strategy.LoginApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class LoginApplicationService {

    @Autowired
    private LoginApplicationContext context;

    public AjaxResult login(String channel, UserBaseInfoRegisterVO request) {
        // 动态选择策略
        ChannelStrategy strategy = context.getStrategy(channel);
        if (strategy != null) {
            // 使用模板模式执行流程
            UserBaseLoginTemplate template = new ChannelSpecificLoanApplication(strategy);
            AjaxResult login = template.login(request);
            return login;
        } else {
            System.out.println("Unsupported channel: " + channel);
        }
        return AjaxResult.error("");
    }
}
