package com.xworkz.hosapp;

public class Patient {
    int patientId;
    String patientName;
    String address;

    public Patient(int patientId){
        this(" Bharathi", " Bangalore ");
        System.out.println( " invoking one parameterized constructor");
        this.patientId=patientId;
    }
    public Patient(String patientName , String address){
        System.out.println( " invoking two parameterized constructor");
        this.patientName=patientName;
        this.address=address;

    }
    }
