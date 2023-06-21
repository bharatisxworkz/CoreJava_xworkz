package com.xworkz.hospitalapp.hospital;

import com.xworkz.hospitalapp.patient.Patient;

public class ApolloHospitalImpl  implements Hospital {
    Patient[] patient = new Patient[3];
    int index;

    @Override
    public boolean addPatient(Patient patient) {
        System.out.println("Invoked addPatient method");
        boolean isAdded = false;
        if (patient!= null) {
            System.out.println("Patient check is Completed... Proceed to add the Patient");
            if (patient.getPatientName() != null && !patient.getPatientName().isEmpty() && patient.getBloodGroup() != null && patient.getAddress() != null) {
                this.patient[index] = patient;
                index++;
                isAdded = true;
                System.out.println("Patient data added Successfully");
            } else {

            }
        } else {
            System.out.println("patient data not added...");
        }


        return isAdded;
    }

@Override
    public void getAllPatients() {
        System.out.println("Invoked getAllPatients");
        System.out.println("List of Patients are:");
        for (Patient pat : this.patient) {
            System.out.println(pat);

        }
    }
}


