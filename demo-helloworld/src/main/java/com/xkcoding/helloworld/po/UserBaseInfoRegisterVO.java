package com.xkcoding.helloworld.po;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class UserBaseInfoRegisterVO {

    /**
     * 用户登录手机号
     */
    String mobile_number;

    /**
     * 验证码
     */
    String vcode;
    /**
     * 注册密码
     */
    String password;

    String accessToken;
    String rePassword;
    /**
     * 渠道
     */
    String channel;
    /**
     * 是否响应数据加密 ： 默认true
     */
    private Boolean encrypted = Boolean.TRUE;
    private String userSource;

    /**
     * 是否新风控
     */
    private String isNewRisk;

    /**
     * 渠道大类
     */
    private String channelFirst;
    /**
     * 渠道二级类目
     */
    private String channelSecond;
    /**
     * 渠道三级类目
     */
    private String channelThird;
    /**
     * AF转化数据
     */
    private String afConversionData;
    /**
     * 分享码code
     */
    private String shareCode;
}
