package com.xworkz.hosapp;

public class PatientTester {
    public static void main( String a[])
    {
        Patient pat= new Patient(1);
        System.out.println(pat.patientId+ " " +pat.patientName+ " " +pat.address);

    }
}

