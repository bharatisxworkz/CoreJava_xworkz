package com.xworkz.bankapp;

public class CurrentAccountTester {
    public static void main(String args[]){
        CurrentAccount currentaccount = new CurrentAccount();
        System.out.println("check balance before credit"+currentaccount.getBalance());
        currentaccount.credit(50000);
        double total= currentaccount.getBalance();
        currentaccount.debit(350);
        System.out.println("check balance after"+currentaccount.getBalance());

    }



}
