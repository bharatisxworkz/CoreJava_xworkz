package com.xworkz.softwareproduct.repo;


import java.sql.SQLException;

import com.xworkz.softwareproduct.dto.SoftwareProductDTO;

public interface SoftwareProductRepo {

	boolean onSave(SoftwareProductDTO dto) throws SQLException;
	
	boolean search(int version) throws SQLException;
	
	boolean search(String softwareName) throws SQLException;

	
	boolean update (int price, int version, String osVersion) throws SQLException;
	
	boolean readAll() throws SQLException;
	
	boolean delete(String softwareName) throws SQLException;

	boolean update(String userName) throws SQLException;

	
	
	
	
}
