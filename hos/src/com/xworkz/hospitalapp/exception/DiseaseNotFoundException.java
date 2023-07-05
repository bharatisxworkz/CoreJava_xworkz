package com.xworkz.hospitalapp.exception;

import com.sun.xml.internal.ws.addressing.W3CAddressingConstants;

public class DiseaseNotFoundException extends RuntimeException{

    public DiseaseNotFoundException(String diseaseName){

        System.out.println("no disease found " +diseaseName);
    }
}
