package com.xkcoding.helloworld.temp;

import com.xkcoding.helloworld.temp.s.LoanDisbursementStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class LoanDisbursementOperation extends BaseOperationTemplate {

    private LoanDisbursementStrategy loanDisbursementStrategy;

    public void setLoanDisbursementStrategy(LoanDisbursementStrategy loanDisbursementStrategy) {
        this.loanDisbursementStrategy = loanDisbursementStrategy;
    }

    @Override
    protected void preProcess() {
        System.out.println("Pre-processing loan disbursement...");
    }

    @Override
    protected void process() {
        if (loanDisbursementStrategy == null) {
            throw new IllegalStateException("LoanDisbursementStrategy is not set");
        }
        loanDisbursementStrategy.disburseLoan();
    }

    @Override
    protected void postProcess() {
        System.out.println("Post-processing loan disbursement...");
    }
}
