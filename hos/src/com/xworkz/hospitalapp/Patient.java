package com.xworkz.hospitalapp;

import lombok.*;
@Data
public class Patient {
     private int id;
     private String name;
     private String diseaseName;
     Address address;
     private String bloodGroup;
     private int age;



}
