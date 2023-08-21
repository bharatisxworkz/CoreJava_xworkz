package com.xworkz.softwareproduct3.repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.softwareproduct3.dto.SoftwareProduct3DTO;
import com.xworkz.softwareproduct3.util.SoftwareProduct3Util;

public class SoftwareProduct3RepoImpl implements SoftwareProduct3Repo{

	SoftwareProduct3Util util3= new SoftwareProduct3Util();
	public SoftwareProduct3RepoImpl() {
		System.out.println("SoftwareProduct3RepoImpl constructor");
		
	}
	
	public boolean validateAndSave(SoftwareProduct3DTO dto3) throws SQLException {
		System.out.println("ValidationAndSave invoked");
		try {
			//getClass();
			Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch(ClassNotFoundException e3) {
			e3.printStackTrace();
			
		}
		
			Connection connection =DriverManager.getConnection(util3.url,util3.userName,util3.password);
System.out.println("Connection established "+connection);
		
			
			
		String query= "insert into transport.softwareproduct3 values(?,?,?,?)";
		//Connection connection ;
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setString(1, dto3.getUserName());
		preparedStatement.setString(2, dto3.getEmail());
		preparedStatement.setString(3, dto3.getSoftwareName());
		preparedStatement.setString(4,dto3.getVersion());
		
		int rows=preparedStatement.executeUpdate();
		if(rows>0) {
			return true;
		}else {
		return false;
	}
	
	}
}


