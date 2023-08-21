package com.xworkz.softwareproduct3.service;

import java.sql.SQLException;

import com.xworkz.softwareproduct3.dto.SoftwareProduct3DTO;

public interface SoftwareProduct3Service {

	boolean validateAndSave(SoftwareProduct3DTO dto3) throws SQLException;

}
