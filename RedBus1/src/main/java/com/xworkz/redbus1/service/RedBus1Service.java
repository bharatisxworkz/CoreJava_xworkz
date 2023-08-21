package com.xworkz.redbus1.service;

import java.sql.SQLException;

import com.xworkz.redbus1.dto.RedBus1DTO;

public interface RedBus1Service {
	
	boolean validateAndSave(RedBus1DTO dto) throws SQLException, ClassNotFoundException;

}
