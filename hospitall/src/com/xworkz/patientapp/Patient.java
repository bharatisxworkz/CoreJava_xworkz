package com.xworkz.patientapp;

import com.xworkz.patientapp.constant.Gender;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Setter



public class Patient {
  private   int patientId;
  private  String name;
    private Gender gender;
}


