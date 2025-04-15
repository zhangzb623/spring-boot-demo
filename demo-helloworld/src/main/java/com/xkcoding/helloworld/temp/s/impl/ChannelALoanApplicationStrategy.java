package com.xkcoding.helloworld.temp.s.impl;

import com.xkcoding.helloworld.temp.s.LoanApplicationStrategy;
import com.xkcoding.helloworld.temp.s.LoginStrategy;
import org.springframework.stereotype.Component;

@Component("channelALoanApplicationStrategy")
public class ChannelALoanApplicationStrategy implements LoanApplicationStrategy {
    @Override
    public void applyLoan() {
        System.out.println("Executing LoanApplication for Channel A");
    }
}
