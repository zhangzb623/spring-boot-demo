package com.xkcoding.helloworld.temp.s.impl;

import com.xkcoding.helloworld.temp.s.LoanDisbursementStrategy;
import org.springframework.stereotype.Component;

@Component("channelBLoanDisbursementStrategy")
public class ChannelBLoanDisbursementStrategy implements LoanDisbursementStrategy {
    @Override
    public void disburseLoan() {
        System.out.println("Executing LoanDisbursement for Channel B");
    }
}
