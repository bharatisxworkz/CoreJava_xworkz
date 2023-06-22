package com.xworkz.hospitalapp.hospital;

import com.xworkz.hospitalapp.patient.Patient;

public interface Hospital {
     // has a relation
           boolean addPatient(Patient patient);
           void getAllPatients();
           Patient getPatientNameByAddress(String address);
    String getPatientNameByWardNo(String wardNo);
    boolean updatePatientDiseaseByPatientName(String existingPatientName, String updatedDiseaseName);
    boolean updatePatientWardNoByPatientId(int existingId,String updatedWardNo);






}
