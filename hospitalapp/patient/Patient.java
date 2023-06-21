package com.xworkz.hospitalapp.patient;

import lombok.Getter;
import lombok.*;
@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Patient {
  // 9 data
   private String patientName;
   private int patientId;
   private String bloodGroup;
   private int age;
   private String address;
   private long contactNo;
   private String diseaseName;
   Document document;
    Gender gender;




}
