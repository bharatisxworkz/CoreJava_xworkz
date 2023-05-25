package com.xworkz.bankapp;
//base /parent/super

public class BankAccount {
    private double balance;
    public void debit(double amount){
        balance=balance-amount;
    }
    public void credit(double amount){
        balance=balance+amount;
    }
    public double getBalance(){
        return balance;
    }
    public void transfer(BankAccount beneficiaryaccount , double amount){
        beneficiaryaccount.credit(amount);
        this.debit(amount);

    }


}
