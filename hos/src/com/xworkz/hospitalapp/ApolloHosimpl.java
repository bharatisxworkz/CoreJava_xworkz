package com.xworkz.hospitalapp;

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

    @Override
    public String getStreetNameByPatientId(int existingPatientId) {
        System.out.println("invoking getStreetNameByPatientId method");
        String streetName=null;
        for (Patient pat : patient) {
            if(pat.getId()==existingPatientId){
                streetName=pat.getAddress().getCountry().getState().getCity().getArea().getStreet().getStreetName();
             //   System.out.println(pat.getAddress().);
            }

        }
        return streetName;
    }
}
