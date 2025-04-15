package com.xkcoding.helloworld.temp;

import com.xkcoding.helloworld.temp.s.LoginStrategy;
import org.springframework.stereotype.Component;

@Component
public class LoginOperation extends BaseOperationTemplate {

    private LoginStrategy loginStrategy;

    public void setLoginStrategy(LoginStrategy loginStrategy) {
        this.loginStrategy = loginStrategy;
    }

    @Override
    protected void preProcess() {
        System.out.println("Pre-processing login...");
    }

    @Override
    protected void process() {
        if (loginStrategy == null) {
            throw new IllegalStateException("LoginStrategy is not set");
        }
        loginStrategy.login();
    }

    @Override
    protected void postProcess() {
        System.out.println("Post-processing login...");
    }
}
