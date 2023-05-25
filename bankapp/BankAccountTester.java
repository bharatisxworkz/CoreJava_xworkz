package com.xworkz.bankapp;

public class BankAccountTester {
    public static void main(String args[]){
        BankAccount bankaccount = new BankAccount();
        System.out.println("check balance before credit" +bankaccount.getBalance());
        bankaccount.credit(10000.00);
        double total=bankaccount.getBalance();
        bankaccount.debit(5000);
        System.out.println("check balance after "+bankaccount.getBalance());
    }
}
