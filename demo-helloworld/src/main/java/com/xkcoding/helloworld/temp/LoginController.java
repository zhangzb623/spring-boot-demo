package com.xkcoding.helloworld.temp;

import com.xkcoding.helloworld.temp.s.LoginStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

  private final LoginOperation loginOperation;
  private final OperationFactory operationFactory;

  @Autowired
  public LoginController(LoginOperation loginOperation, OperationFactory operationFactory) {
    this.loginOperation = loginOperation;
    this.operationFactory = operationFactory;
  }

  @GetMapping("/login")
  public String performLogin(@RequestParam String channel) {
    LoginStrategy strategy = operationFactory.getLoginStrategy(channel);
    loginOperation.setLoginStrategy(strategy); // 动态设置策略
    loginOperation.execute(); // 执行模板方法
    return "Login executed for " + channel;
  }
}
