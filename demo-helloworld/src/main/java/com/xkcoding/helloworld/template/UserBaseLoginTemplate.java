package com.xkcoding.helloworld.template;

import cn.hutool.json.JSONUtil;
import com.xkcoding.helloworld.po.AjaxResult;
import com.xkcoding.helloworld.po.UserBaseInfoRegisterVO;
import com.xkcoding.helloworld.userbase.service.ITBusUserbaseinfoService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.ObjectUtils;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;

@Component
@Slf4j
public abstract class UserBaseLoginTemplate {

    @Autowired
    ITBusUserbaseinfoService userbaseinfoService;

    // 模板方法，定义申请贷款的整体流程
    public final AjaxResult login(UserBaseInfoRegisterVO vo) {
        AjaxResult ajaxResult = validateRequest(vo);// 1. 参数校验
        processLoanApplication(vo);  // 2. 渠道特定逻辑
        logApplication();                 // 3. 记录日志

        return ajaxResult;
    }

    // 公共方法：参数校验
    private AjaxResult validateRequest(UserBaseInfoRegisterVO vo) {
        String mobile = vo.getMobile_number();
        String vcode = vo.getVcode();
        String password = vo.getPassword();
        String channel = vo.getChannel();
        log.info("UserBaseInfoRegisterVO:{}", JSONUtil.toJsonStr(vo));

        if (StringUtils.isEmpty(mobile) || StringUtils.isEmpty(vcode)) {
            log.info("The mobile phone number or verification code cannot be empty！mobile:{}", vo.getMobile_number());
            return AjaxResult.error("The mobile phone number or verification code cannot be empty！");
        }
        if (StringUtils.isEmpty(password)) {
            log.info("The password cannot be empty;mobile:{}", mobile);
            return AjaxResult.error("The password cannot be empty");
        }
        return AjaxResult.success("SUCCESS");
    }

    // 抽象方法：子类实现渠道特定逻辑
    protected abstract void processLoanApplication(UserBaseInfoRegisterVO request);

    // 公共方法：记录日志
    private void logApplication() {
        System.out.println("Logging application details...");
        // 日志记录逻辑...
    }
}
