package com.xworkz.redbus1.repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.xworkz.redbus1.dto.RedBus1DTO;
import com.xworkz.redbus1.util.RedBus1Util;

public class RedBus1RepoImpl implements RedBus1Repo {
	
	RedBus1Util util= new RedBus1Util();
	public RedBus1RepoImpl() {
		System.out.println("RedBusImpl constructor");
		
	}
	public boolean validateAndSave(RedBus1DTO dto) throws SQLException, ClassNotFoundException {
		System.out.println("ValidationAndSave invoked");
		
	
			Class.forName("com.mysql.cj.jdbc.Driver");
	
		
		
			Connection connection =DriverManager.getConnection(util.url,util.userName,util.password);
System.out.println("Connection established "+connection);

String query= "insert into transport.redbus1 values(?,?,?,?)";
//Connection connection ;
PreparedStatement preparedStatement = connection.prepareStatement(query);
preparedStatement.setInt(1, dto.getId());
preparedStatement.setString(2, dto.getBusName());
preparedStatement.setString(3, dto.getSourcePoint());
preparedStatement.setString(4,dto.getDestination());

int rows=preparedStatement.executeUpdate();
if(rows>0) {
	return true;
}else {
return false;
}

}
}
		
