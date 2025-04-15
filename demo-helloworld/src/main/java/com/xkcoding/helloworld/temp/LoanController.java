package com.xkcoding.helloworld.temp;

import com.xkcoding.helloworld.temp.s.LoanApplicationStrategy;
import com.xkcoding.helloworld.temp.s.LoanDisbursementStrategy;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoanController {

    private final LoanApplicationOperation loanApplicationOperation;
    private final LoanDisbursementOperation loanDisbursementOperation;
    private final OperationFactory operationFactory;

    @Autowired
    public LoanController(
            LoanApplicationOperation loanApplicationOperation,
            LoanDisbursementOperation loanDisbursementOperation,
            OperationFactory operationFactory) {
        this.loanApplicationOperation = loanApplicationOperation;
        this.loanDisbursementOperation = loanDisbursementOperation;
        this.operationFactory = operationFactory;
    }

    @GetMapping("/apply-loan")
    public String applyLoan(@RequestParam String channel) {
        LoanApplicationStrategy strategy = operationFactory.getLoanApplicationStrategy(channel);
        loanApplicationOperation.setLoanApplicationStrategy(strategy);
        loanApplicationOperation.execute();
        return "Loan application executed for " + channel;
    }

    @GetMapping("/disburse-loan")
    public String disburseLoan(@RequestParam String channel) {
        LoanDisbursementStrategy strategy = operationFactory.getLoanDisbursementStrategy(channel);
        loanDisbursementOperation.setLoanDisbursementStrategy(strategy);
        loanDisbursementOperation.execute();
        return "Loan disbursement executed for " + channel;
    }
}
