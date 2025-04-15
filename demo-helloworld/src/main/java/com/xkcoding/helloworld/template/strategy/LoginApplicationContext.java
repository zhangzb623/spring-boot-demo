package com.xkcoding.helloworld.template.strategy;

import cn.hutool.core.util.StrUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class LoginApplicationContext {
    private final Map<String, ChannelStrategy> strategyMap;
    private final ChannelStrategy defaultStrategy;

    // 注入所有策略Bean
    @Autowired
    public LoginApplicationContext(Map<String, ChannelStrategy> strategyMap,
                                   @Qualifier("defaultChannelStrategy") ChannelStrategy defaultStrategy) {
        this.strategyMap = strategyMap;
        this.defaultStrategy = defaultStrategy;
    }

    // 获取策略
    public ChannelStrategy getStrategy(String channel) {
        String beanName = (StrUtil.isNotBlank(channel) ? channel : "") + "ChannelStrategy";
        return strategyMap.getOrDefault(beanName, defaultStrategy);
    }
}
