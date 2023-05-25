package com.xworkz.bankapp;

public class SavingAccountTester {
    public static void main(String args[]) {
        SavingAccount bharatiAccount = new SavingAccount();
        bharatiAccount.credit(100000.00);
        System.out.println("saving account after credit:"+bharatiAccount.getBalance());


        //beneficiary Account
        SavingAccount sephoraAccount=new SavingAccount();
        bharatiAccount.transfer(sephoraAccount,10000.00);
        System.out.println("puma account after credit:"+sephoraAccount.getBalance());
        System.out.println("bharati account after credit:"+bharatiAccount.getBalance());

        //beneficiary Account2
        SavingAccount pumaAccount =new SavingAccount();
        bharatiAccount.transfer(pumaAccount,9000.00);
        System.out.println("puma account after credit:"+pumaAccount.getBalance());
        System.out.println("bharati account after credit:"+bharatiAccount.getBalance());

        //beneficiary Account3
        SavingAccount nykaaAccount=new SavingAccount();
        bharatiAccount.transfer(nykaaAccount,6000.00);
        System.out.println("nykaa account after credit:"+nykaaAccount.getBalance());
        System.out.println("bharati account after credit:"+bharatiAccount.getBalance());

        //beneficiary Account
        SavingAccount celioAccount=new SavingAccount();
        bharatiAccount.transfer(celioAccount,20000.00);
        System.out.println("celio account after credit:"+celioAccount.getBalance());
        System.out.println("bharati account after credit:"+bharatiAccount.getBalance());

        //beneficiary Account
        SavingAccount onlyAccount=new SavingAccount();
        bharatiAccount.transfer(onlyAccount,14000.00);
        System.out.println("only account after credit:"+onlyAccount.getBalance());
        System.out.println("bharati account after credit:"+bharatiAccount.getBalance());

        //beneficiary Account
        SavingAccount maxAccount=new SavingAccount();
        bharatiAccount.transfer(maxAccount,16000.00);
        System.out.println("max account after credit:"+maxAccount.getBalance());
        System.out.println("bharati account after credit:"+bharatiAccount.getBalance());

        //beneficiary Account
        SavingAccount jockeyAccount=new SavingAccount();
        bharatiAccount.transfer(jockeyAccount,15000.00);
        System.out.println("jockey account after credit:"+jockeyAccount.getBalance());
        System.out.println("bharati account after credit:"+bharatiAccount.getBalance());

    }



    }
