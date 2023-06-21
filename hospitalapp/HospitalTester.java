package com.xworkz.hospitalapp;

import com.xworkz.hospitalapp.hospital.ApolloHospitalImpl;
import com.xworkz.hospitalapp.hospital.Hospital;
import com.xworkz.hospitalapp.patient.Document;
import com.xworkz.hospitalapp.patient.Gender;
import com.xworkz.hospitalapp.patient.Patient;

public class HospitalTester {

    public static void main(String[] args) {

      // Abstraction
        Hospital hos = new ApolloHospitalImpl();
        Patient pat = new Patient();
        pat.setPatientName("Hallapa");
        pat.setPatientId(1);
        pat.setBloodGroup("B+");
        pat.setAge(25);
        pat.setAddress("Rajajinagar");
        pat.setContactNo(9900887766L);
        pat.setDiseaseName("Malaria");
        pat.setDocument(Document.AADHAAR);
        pat.setGender(Gender.MALE);
        hos.addPatient(pat);
        hos.getAllPatients();


        Patient pat2 = new Patient();
        pat2.setPatientName("Bharathi");
        pat2.setPatientId(2);
        pat2.setBloodGroup("A+");
        pat2.setAge(30);
        pat2.setAddress("Jayanagar");
        pat2.setContactNo(9900883524L);
        pat2.setDiseaseName("Fever");
        pat2.setDocument(Document.PAN);
        pat2.setGender(Gender.FEMALE);
        hos.addPatient(pat2);
        hos.getAllPatients();

        Patient pat3 = new Patient();
        pat3.setPatientName("XYZ");
        pat3.setPatientId(3);
        pat3.setBloodGroup("O+");
        pat3.setAge(28);
        pat3.setAddress("KR Puram");
        pat3.setContactNo(9900881542L);
        pat3.setDiseaseName("Cold");
        pat3.setDocument(Document.DL);
        pat3.setGender(Gender.FEMALE);
        hos.addPatient(pat3);
        hos.getAllPatients();






    }
}
