package com.xworkz.hospitalapp;

import com.xworkz.hospitalapp.exception.DiseaseNotFoundException;
import com.xworkz.hospitalapp.exception.PatientIdNotFoundException;

public class ApolloHosimpl implements Hospital {
    Patient patient[];
    int index;
    public ApolloHosimpl(int size){
        patient = new Patient[size];

    }

    @Override
    public boolean addPatient(Patient patient) {
        System.out.println("Invoked addPatient method");
        boolean isAdded = false;
        if (patient != null) {
            System.out.println("Patient check is Completed... Proceed to add the Patient");
            if (patient.getName() != null && !patient.getName().isEmpty() ) {
                this.patient[index] = patient;
                index++;
                isAdded = true;
                System.out.println("Patient data added Successfully");
            } else {
                System.out.println("data is empty");
            }
        }
                else {
            System.out.println("patient check incomplete");
        }
                return isAdded;


    }

    @Override
    public void getAllPatient() {
        System.out.println("invoked getAllPatient method");
        System.out.println("list are");
        for (Patient pat: this.patient) {
            System.out.println(pat);

        }

    }

    //@Override
    public String getStreetNameByPatientId(int id) {
        System.out.println("invoking getStreetNameByPatientId method");
        String streetName=null;
        for (Patient pat : patient) {
            if(pat.getId()==id){
               streetName=pat.getAddress().getCountry().getState().getCity().getArea().getStreet().getStreetName();
            }
            PatientIdNotFoundException exception = new PatientIdNotFoundException(id);
            throw exception;

        }


     return streetName;
    }

    @Override
    public String[] getPatientNameByDiseaseName(String diseaseName) {
        System.out.println("invoking getPatientNameByDiseaseName method");
            String patientName[] = new String[2];
            for (Patient pat: this.patient) {
                if(pat.getDiseaseName().equals(diseaseName)){
                   patientName[index] = pat.getName();
                }
                else{
                    DiseaseNotFoundException exception = new DiseaseNotFoundException(diseaseName);
                    throw exception;
                }

            }
            return patientName;
    }
}
