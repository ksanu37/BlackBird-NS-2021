package com.company;

import com.company.JavaConcepts.CustomException;

public class BankTransactions {

    public static int balanceAfterTransaction(int currentBalance, int deductionAmount) throws CustomException {
            if (currentBalance > deductionAmount) {
                currentBalance -= deductionAmount;
                return currentBalance;
            } else
                throw new CustomException("Deduction Amount is greater than current Amount");
    }
}
