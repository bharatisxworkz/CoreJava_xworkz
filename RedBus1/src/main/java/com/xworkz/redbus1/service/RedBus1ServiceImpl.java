package com.xworkz.redbus1.service;

import java.sql.SQLException;
import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;

import com.xworkz.redbus1.dto.RedBus1DTO;
import com.xworkz.redbus1.repo.RedBus1Repo;
import com.xworkz.redbus1.repo.RedBus1RepoImpl;


public class RedBus1ServiceImpl implements RedBus1Service{

	
RedBus1Repo repo = new RedBus1RepoImpl();
	
	public void RedBus1RepoImpl() {
		System.out.println("RedBus1RepoImpl constructor");
	
	}
	public boolean validateAndSave(RedBus1DTO dto) throws SQLException, ClassNotFoundException {
		if(dto!=null) {
			boolean add= repo.validateAndSave(dto);
			ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
			Validator validator = factory.getValidator();
			Set<ConstraintViolation<RedBus1DTO>> violation = validator.validate(dto);
			if(violation.isEmpty()) {
			System.out.println("dto is not null,we can save the data");
			
			boolean save = repo.validateAndSave(dto);
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
