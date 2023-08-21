package com.xworkz.softwareproduct3.repo;

import java.sql.SQLException;

import com.xworkz.softwareproduct3.dto.SoftwareProduct3DTO;

public interface SoftwareProduct3Repo {

	boolean validateAndSave(SoftwareProduct3DTO dto3) throws SQLException;

}
