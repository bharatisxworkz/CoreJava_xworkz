package com.xworkz.patientapp;

public class Tester2 {
    //init block
    {
        System.out.println(" init block invoked");
    }

    {
        System.out.println(" init block invoked");
    }

    {
        System.out.println(" init block invoked");
    }
    public static void main(String[] args){

    }

    static{
        System.out.println(" static block invoked");
    }

    static {
        System.out.println(" static block invoked");
    }

    static {
        System.out.println(" static block invoked");
    }


    public Tester2(){
        Tester2 tester = new Tester2();
        System.out.println("Tester constructor is invoked");

    }

}
