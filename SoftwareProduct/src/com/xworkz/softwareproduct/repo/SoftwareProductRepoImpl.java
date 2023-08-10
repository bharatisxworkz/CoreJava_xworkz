package com.xworkz.softwareproduct.repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.xworkz.softwareproduct.dto.SoftwareProductDTO;
import com.xworkz.softwareproduct.util.Util;

public class SoftwareProductRepoImpl implements SoftwareProductRepo {

	
	Util util = new Util();
	@Override
	public boolean onSave(SoftwareProductDTO dto) throws SQLException {
		System.out.println("dto:"+dto);
		Connection connection = DriverManager.getConnection(Util.url,Util.userName,Util.password);
		String query= "insert into transport.softwareproduct values(?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setString(1, dto.getUserName());
		preparedStatement.setString(2, dto.getEmail());
		preparedStatement.setLong(3, dto.getPhone());
		preparedStatement.setString(4,dto.getSoftwareName());
		preparedStatement.setInt(5, dto.getVersion());
		preparedStatement.setString(6,dto.getDoe());
		preparedStatement.setString(7,dto.getPassword());
		preparedStatement.setInt(8, dto.getPrice());
		preparedStatement.setString(9,dto.getOsVersion());
		preparedStatement.setInt(10, dto.getId());
		
		int rows=preparedStatement.executeUpdate();
		if(rows>0) {
			return true;
		}else {
		return false;
	}
	}
	@Override
	public boolean search(int productVersion) throws SQLException {
		Connection connection = DriverManager.getConnection(Util.url,Util.userName,Util.password);
		String query = "select * from transport.softwareproduct where version=?";
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setInt(1, productVersion);
		ResultSet result = preparedStatement.executeQuery();
		while(result.next()) {
			System.out.println(" userName:"+result.getString(1)+ " email:"+result.getString(2)+ " phone:"+result.getLong(3)+ " softwareName:"+result.getString(4)+ " version"+result.getInt(5)+ " doe:"+ result.getString(6)+ " password:"+result.getString(7)+ " price:"+result.getInt(8)+ " osVersion:"+result.getString(9) + " id:"+result.getInt(10));
		}
		
		
		return true;
	}
	public boolean search(String softwareName) throws SQLException {
		Connection connection = DriverManager.getConnection(Util.url,Util.userName,Util.password);
		String query = "select * from transport.softwareproduct where softwareName=?";
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setString(1, softwareName);
		ResultSet result = preparedStatement.executeQuery();
		while(result.next()) {
			System.out.println(" userName:"+result.getString(1)+ " email:"+result.getString(2)+ " phone:"+result.getLong(3)+ " softwareName:"+result.getString(4)+ " version"+result.getInt(5)+ " doe:"+ result.getString(6)+ " password:"+result.getString(7)+ " price:"+result.getInt(8)+ " osVersion:"+result.getString(9)+ " id:"+result.getInt(10));
		}

		return true;
	}
	@Override
	public boolean update(String userName) throws SQLException {
		Connection connection = DriverManager.getConnection(Util.url,Util.userName,Util.password);
		String query = "update transport.softwareproduct userName=?";
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setString(1, userName);
		int rows =preparedStatement.executeUpdate();
		if(rows>0) {
			return true;
			
		}else {
			return false;
		}
		

	}
	@Override
	public boolean update(int price, int version, String osVersion) throws SQLException {
		Connection connection = DriverManager.getConnection(Util.url,Util.userName,Util.password);
		String query = "update transport.softwareproduct set price=? , version=? where osVersion=?";
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setInt(1, price);
		preparedStatement.setInt(2, version);
		preparedStatement.setString(3, osVersion);
		int rows =preparedStatement.executeUpdate();
		if(rows>0) {
			return true;
			
		}else {
			return false;
		}
		
		

	}
	@Override
	public boolean readAll() throws SQLException {
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/transport","root","Xworkzodc@123");
		String query = "select * from transport.softwareproduct" ;
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		
		ResultSet result =preparedStatement.executeQuery();
		while(result.next()) {
			System.out.println(" userName:"+result.getString(1)+ " email:"+result.getString(2)+ " phone:"+result.getLong(3)+ " softwareName:"+result.getString(4)+ " version"+result.getInt(5)+ " doe:"+ result.getString(6)+ " password:"+result.getString(7)+ " price:"+result.getInt(8)+ " osVersion:"+result.getString(9) + " id:"+result.getInt(10));
			return true;
		}
		return false;
		
		
	}
	@Override
	public boolean delete(String softwareName) throws SQLException {
		Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/transport","root","Xworkzodc@123");
		String query = "delete from transport.softwareproduct where softwareName=?" ;
		PreparedStatement preparedStatement = connection.prepareStatement(query);
		preparedStatement.setString(1,softwareName);
		int rows =preparedStatement.executeUpdate();
		if(rows>0) {
			return true;
			
		}else {
			return false;
		}
		

	}

	
	}

