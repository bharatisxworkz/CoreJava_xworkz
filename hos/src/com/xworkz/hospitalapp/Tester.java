package com.xworkz.hospitalapp;

import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {
        System.out.println("Main invoked");
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of patient");
        int size = sc.nextInt();
        Hospital hospital = new ApolloHosimpl(size);

        for (int patientIndex = 0; patientIndex < size; patientIndex++) {
            Patient pat = new Patient();

            System.out.println("enter patient id");
            pat.setId(sc.nextInt());

            System.out.println("enter patient name");
            pat.setName(sc.next());

            System.out.println("enter patient disease name");
            pat.setDiseaseName(sc.next());

            System.out.println("enter patient blood group");
            pat.setBloodGroup(sc.next());

            System.out.println("enter patient age");
            pat.setAge(sc.nextInt());

            hospital.addPatient(pat);


            Street street = new Street();
            Area area = new Area();
            City city = new City();
            State state = new State();
            Country country = new Country();
            Address address=new Address();

            System.out.println("Enter the street name:");
            street.setStreetName(sc.next());
            System.out.println("Enter the area name:");
            area.setArea(sc.next());
            System.out.println("Enter the City name:");
           city.setCity(sc.next());
           System.out.println("Enter the state name:");
            state.setState(sc.next());
            System.out.println("Enter the country name:");
            country.setCountry(sc.next());

            area.setStreet(street);
            city.setArea(area);
            state.setCity(city);
            country.setState(state);
            address.setCountry(country);
            pat.setAddress(address);


        }
        String text ;
        do{
            System.out.println("1.Get all the patient details");
            System.out.println("2. Get patient by name");
            int option = sc.nextInt();
            switch (option){
                case 1: System.out.println("the list of patients are:");
                hospital.getAllPatient();
                break;

                case 2 :   System.out.println("patient disease name");
                    hospital.getPatientNameByDiseaseName(sc.next());
                    break;

                case 3: System.out.println("enter patient id");
                    hospital.getStreetNameByPatientId(sc.nextInt());

            }
            System.out.println("Do you want to continue: y\n");
            text = sc.next();

        }while(text.equals("y"));



        hospital.getAllPatient();

       System.out.println("enter patient id");
        hospital.getStreetNameByPatientId(sc.nextInt());

       System.out.println("patient disease name");
        hospital.getPatientNameByDiseaseName(sc.next());


    }
}
