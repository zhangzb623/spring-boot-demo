package com.xkcoding.helloworld.userbase.controller;

import com.xkcoding.helloworld.po.AjaxResult;
import com.xkcoding.helloworld.po.UserBaseInfoRegisterVO;
import com.xkcoding.helloworld.userbase.service.LoginApplicationService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * zzb Controller
 */
@RequestMapping("/app1")
@RestController
@Slf4j
//@Validated
public class UserBaseController {
    @Autowired
    private LoginApplicationService loginApplicationService;
    /**
     * 验证-验证码，并设置密码
     *
     * @param vo
     * @return
     */
    @PostMapping("login")
    public AjaxResult login(@RequestBody UserBaseInfoRegisterVO vo) {
        log.info("loginApplicationService.login()");
        return loginApplicationService.login(vo.getChannel(), vo);
    }


}
