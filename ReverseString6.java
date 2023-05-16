package com.xworkz.hosapp;

public class ReverseString6 {
    public static void main( String a[])
    {
        String name= "123456";
        char[] reverseString = name.toCharArray();
        for( int i=name.length()-1;i>=0;i--)
        {
            System.out.print( reverseString [i]);
        }
    }
}
