package com.xworkz.hospitalapp.hospital;

import com.xworkz.hospitalapp.patient.Patient;

public interface Hospital {
     // has a relation
           boolean addPatient(Patient patient);
           void getAllPatients();


}
