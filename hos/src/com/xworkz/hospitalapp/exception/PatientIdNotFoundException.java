package com.xworkz.hospitalapp.exception;

public class PatientIdNotFoundException extends RuntimeException{
    public PatientIdNotFoundException(int id){
        System.out.println("Please enter disease"+id);
    }
}
