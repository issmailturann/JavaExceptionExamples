package com.issmailturan.userDefinedExceptions2;

public class InsufficientBalanceException extends Exception  {

    private double amount;

    public InsufficientBalanceException(double amount, String message){
        super(message);
        this.amount = amount;
    }
    public double getAmount() {
        return amount;
    }
}
