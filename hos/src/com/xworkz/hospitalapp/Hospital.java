package com.xworkz.hospitalapp;

public interface Hospital {
    boolean addPatient(Patient patient);
    void getAllPatient();

    String getStreetNameByPatientId(int existingPatientId);

}
