package com.xworkz.softwareproduct3.service;

import java.sql.SQLException;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;


import com.xworkz.softwareproduct3.dto.SoftwareProduct3DTO;
import com.xworkz.softwareproduct3.repo.SoftwareProduct3Repo;
import com.xworkz.softwareproduct3.repo.SoftwareProduct3RepoImpl;

public class SoftwareProduct3ServiceImpl implements SoftwareProduct3Service{

	SoftwareProduct3Repo repo3 = new SoftwareProduct3RepoImpl();
	
	public void SoftwareProduct3RepoImpl() {
		System.out.println("SoftwareProduct3RepoImpl constructor");
	
	}
	public boolean validateAndSave(SoftwareProduct3DTO dto3) throws SQLException {
		if(dto3!=null) {
			boolean add= repo3.validateAndSave(dto3);
			ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
			Validator validator = factory.getValidator();
			Set<ConstraintViolation<SoftwareProduct3DTO>> violation = validator.validate(dto3);
			if(violation.isEmpty()) {
			System.out.println("dto is not null,we can save the data");
			
			boolean save = repo3.validateAndSave(dto3);
			System.out.println("save" +save);
			return true;
			}else {
				System.out.println("violation present inside the dto:"+violation);
				}
		}else {
			System.out.println("dto is null");
		}
			
		
		return false;
		
	}
}
