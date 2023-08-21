package com.xworkz.redbus1.repo;

import java.sql.SQLException;

import com.xworkz.redbus1.dto.RedBus1DTO;

public interface RedBus1Repo {
	boolean validateAndSave(RedBus1DTO dto) throws SQLException, ClassNotFoundException;

}
