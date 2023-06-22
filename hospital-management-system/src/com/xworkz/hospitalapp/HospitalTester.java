package com.xworkz.hospitalapp;

import com.xworkz.hospitalapp.hospital.ApolloHospitalImpl;
import com.xworkz.hospitalapp.hospital.Hospital;
import com.xworkz.hospitalapp.patient.Patient;
import javafx.scene.control.IndexRange;


import java.util.Scanner;

public class HospitalTester {

    public static void main(String[] args) {

        System.out.println("main is invoked");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the Patient details to be added");
        int size = sc.nextInt();

        Hospital hospital = new ApolloHospitalImpl(size);

        for (int patientIndex = 0; patientIndex < size; patientIndex++) {
            Patient patient = new Patient();
            System.out.println("Enter patient Id");
            patient.setPatientId(sc.nextInt());
            System.out.println("Enter patient Name");
            patient.setPatientName(sc.next());
            System.out.println("Enter patient Blood group");
            patient.setBloodGroup(sc.next());
            System.out.println("Enter patient Age");
            patient.setAge(sc.nextInt());
            System.out.println("Enter patient address");
            patient.setAddress(sc.next());
            System.out.println("Enter patient Contact no");
            patient.setContactNo(sc.nextLong());
            System.out.println("Enter patient Disease name");
            patient.setDiseaseName(sc.next());
            System.out.println("Enter patient attender name");
            patient.setAttenderName(sc.next());
            System.out.println("Enter patient ward no");
            patient.setWardNo((sc.next()));
            hospital.addPatient(patient);


        }
        hospital.getAllPatients();

        System.out.println("enter address:");
        hospital.getPatientNameByAddress(sc.next());


        System.out.println("Enter ward no to find patient name: ");
        hospital.getPatientNameByWardNo(sc.next());

        System.out.println("Enter patient name & new disease name both: ");
        hospital.updatePatientDiseaseByPatientName(sc.next(), sc.next());

        System.out.println("Enter patient id to update and Enter new ward no:");
        hospital.updatePatientWardNoByPatientId(sc.nextInt(),sc.next());



    }
}













