package com.issmailturan.userDefinedExceptions2;

public class BankAccount {

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    private double balance;

    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void withdraw(double amount) throws InsufficientBalanceException{

        if(amount > balance){
            double eksik = amount - balance;
            throw new InsufficientBalanceException(eksik, "bu kadar para çekemezsiniz çünkü hesabınızda");
        }
        else {
            balance -= amount;
        }

    }
}
