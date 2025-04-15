package com.xkcoding.helloworld.temp;

import com.xkcoding.helloworld.temp.s.LoanApplicationStrategy;
import org.springframework.stereotype.Component;

@Component
public class LoanApplicationOperation extends BaseOperationTemplate {

    private LoanApplicationStrategy loanApplicationStrategy;

    public void setLoanApplicationStrategy(LoanApplicationStrategy loanApplicationStrategy) {
        this.loanApplicationStrategy = loanApplicationStrategy;
    }

    @Override
    protected void preProcess() {
        System.out.println("Pre-processing loan application...");
    }

    @Override
    protected void process() {
        if (loanApplicationStrategy == null) {
            throw new IllegalStateException("LoanApplicationStrategy is not set");
        }
        loanApplicationStrategy.applyLoan();
    }

    @Override
    protected void postProcess() {
        System.out.println("Post-processing loan application...");
    }
}
