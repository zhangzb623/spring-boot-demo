package com.xkcoding.helloworld.temp;

import com.xkcoding.helloworld.temp.s.LoanApplicationStrategy;
import com.xkcoding.helloworld.temp.s.LoanDisbursementStrategy;
import com.xkcoding.helloworld.temp.s.LoginStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;

@Service
public class OperationFactory {

  private final ApplicationContext applicationContext;

  @Autowired
  public OperationFactory(ApplicationContext applicationContext) {
    this.applicationContext = applicationContext;
  }

  public LoginStrategy getLoginStrategy(String channel) {
    return (LoginStrategy) applicationContext.getBean(channel + "LoginStrategy");
  }

  public LoanApplicationStrategy getLoanApplicationStrategy(String channel) {
    return (LoanApplicationStrategy) applicationContext.getBean(channel + "LoanApplicationStrategy");
  }

  public LoanDisbursementStrategy getLoanDisbursementStrategy(String channel) {
    return (LoanDisbursementStrategy) applicationContext.getBean(channel + "LoanDisbursementStrategy");
  }
}
