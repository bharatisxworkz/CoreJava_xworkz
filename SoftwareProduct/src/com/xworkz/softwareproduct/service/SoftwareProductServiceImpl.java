package com.xworkz.softwareproduct.service;

import java.sql.SQLException;

import com.xworkz.softwareproduct.dto.SoftwareProductDTO;
import com.xworkz.softwareproduct.repo.SoftwareProductRepo;
import com.xworkz.softwareproduct.repo.SoftwareProductRepoImpl;

public class SoftwareProductServiceImpl implements SoftwareProductService{
	
	SoftwareProductRepo repo = new SoftwareProductRepoImpl();

	@Override
	public boolean validation(SoftwareProductDTO dto) throws SQLException {
		System.out.println("Validation method invoked");
		if(dto!=null) {
			System.out.println("dto is not null,we can save the data");
			
			boolean save = repo.onSave(dto);
			System.out.println("save" +save);
			return true;
		}else {
			System.out.println("dto is null");
		}
		return false;
	}

	public boolean search(int version) throws SQLException {
		System.out.println("Search method invoked");
		if(version!=0) {
			boolean search = repo.search(version);
			System.out.println("search"+search);
			return true;
		}
		else {
			return false;
		}
	
	}

	public boolean search(String softwareName) throws SQLException {
		if(softwareName!=null) {
			boolean search=repo.search(softwareName);
			System.out.println("search:"+search);
                 return true;
			
		}else {
		return false;
	}
	}

	public boolean update(String userName) throws SQLException {
		if(userName!=null) {
			boolean update=repo.update(userName);
			System.out.println("update:"+update);
			return true;
		}else {
		return false;
	}
	}

	
	@Override
	public boolean update(int price, int version, String osVersion) throws SQLException {
		if(osVersion!=null) {
			boolean update = repo.update(price,version,osVersion);
			System.out.println("update:"+update);
			return true;
		}else {
		return false;
	}
}

	@Override
	public boolean readAll() throws SQLException {
		boolean read=repo.readAll();
			System.out.println("read:"+read);
			return true;
		}

	@Override
	public boolean delete(String softwareName) throws SQLException {
		if(softwareName!=null) {
			boolean delete=repo.delete(softwareName);
			System.out.println("delete:"+delete);
			return true;
		}else {
		return false;
	}
	
	}

	@Override
	public boolean onSave(SoftwareProductDTO dto) {
		if(dto!=null) {
			System.out.println("dto:"+dto);
			return true;
		}else {
		return false;	
		}
		
	}
	}
