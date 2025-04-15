package com.xkcoding.helloworld.temp.s.impl;

import com.xkcoding.helloworld.temp.s.LoanApplicationStrategy;
import org.springframework.stereotype.Component;

@Component("channelBLoanApplicationStrategy")
public class ChannelBLoanApplicationStrategy implements LoanApplicationStrategy {
    @Override
    public void applyLoan() {
        System.out.println("Executing LoanApplication for Channel B");
    }
}
