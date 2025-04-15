package com.xkcoding.helloworld.temp.s.impl;

import com.xkcoding.helloworld.temp.s.LoanDisbursementStrategy;
import com.xkcoding.helloworld.temp.s.LoginStrategy;
import org.springframework.stereotype.Component;

@Component("channelALoanDisbursementStrategy")
public class ChannelALoanDisbursementStrategy implements LoanDisbursementStrategy {
    @Override
    public void disburseLoan() {
        System.out.println("Executing LoanDisbursement for Channel A");
    }
}
