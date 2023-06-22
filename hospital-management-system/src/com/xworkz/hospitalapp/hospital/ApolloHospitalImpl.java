package com.xworkz.hospitalapp.hospital;

import com.xworkz.hospitalapp.patient.Patient;
import javafx.scene.control.IndexRange;

public class ApolloHospitalImpl implements Hospital {
    Patient[] patient;
    int index;

    public ApolloHospitalImpl(int size) {
        patient = new Patient[size];
    }

    @Override
    public boolean addPatient(Patient patient) {
        System.out.println("Invoked addPatient method");
        boolean isAdded = false;
        if (patient != null) {
            System.out.println("Patient check is Completed... Proceed to add the Patient");
            if (patient.getPatientName() != null && !patient.getPatientName().isEmpty() && patient.getBloodGroup() != null && patient.getAddress() != null) {
                this.patient[index] = patient;
                index++;
                isAdded = true;
                System.out.println("Patient data added Successfully");
            } else {
                System.out.println("data is empty");
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

    @Override
    public Patient getPatientNameByAddress(String address) {
        System.out.println("Invoked getPatientByAddress method");
        if (address != null && !address.isEmpty()) {
            for (int i = 0; i < this.patient.length; i++) {
                if (this.patient[i].getAddress().equals(address)) {
                    System.out.println(this.patient[i]);
                }
            }
        } else {
            System.out.println("Invalid address");
        }
        return null;
    }

    public String getPatientNameByWardNo(String wardNo) {
        System.out.println("Invoked getPatientNameByWardNo method");
        if (wardNo != null && !wardNo.isEmpty()) {
            for (int i = 0; i < this.patient.length; i++) {
                if (this.patient[i].getWardNo().toString().equals(wardNo)) {
                    System.out.println("Patient name: " + this.patient[i].getPatientName());

                }
            }
        } else {
            System.out.println("Invalid ward no");
        }
        return null;
    }

    public boolean updatePatientDiseaseByPatientName(String existingPatientName, String updatedDiseaseName) {
        System.out.println("Invoked updatePatientDiseaseByPatientName method");
        boolean isUpdated = false;

        if (existingPatientName != null && !existingPatientName.isEmpty() && updatedDiseaseName != null && !updatedDiseaseName.isEmpty()) {
            for (int i = 0; i < this.patient.length; i++) {
                if (this.patient[i].getPatientName().equals(existingPatientName)) {
                    this.patient[i].setDiseaseName(updatedDiseaseName);
                    isUpdated = true;
                    System.out.println("Patient disease updated successfully");
                    System.out.println(this.patient[i]);
                }
            }
        } else {
            System.out.println("Invalid patient name or updated disease name");
        }
        return isUpdated;
    }

    public boolean updatePatientWardNoByPatientId(int existingId, String updatedWardNo) {
        System.out.println("Invoked updatePatientWardNoByPatientId method");
        boolean isUpdated1 = false;
        if (existingId != 0 && updatedWardNo != null && !updatedWardNo.isEmpty()) {
            for (int i = 0; i < this.patient.length; i++) {
                if (this.patient[i].getPatientId() == existingId) {

                    this.patient[i].setWardNo((updatedWardNo));
                    isUpdated1 = true;
                    System.out.println("Patient ward number updated successfully");
                    System.out.println(this.patient[i]);
                }
            }
        } else {
            System.out.println("Invalid existing id or updated ward no");
        }
        return isUpdated1;
    }
}





