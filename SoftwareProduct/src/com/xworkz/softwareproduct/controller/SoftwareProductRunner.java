package com.xworkz.softwareproduct.controller;

import java.sql.SQLException;

import com.xworkz.softwareproduct.dto.SoftwareProductDTO;
import com.xworkz.softwareproduct.service.SoftwareProductService;
import com.xworkz.softwareproduct.service.SoftwareProductServiceImpl;

public class SoftwareProductRunner {

	public static void main(String[] args) throws SQLException {
		
		SoftwareProductDTO dto = new SoftwareProductDTO();
		
		dto.setUserName("Bharati BG");
		dto.setEmail("abc@gmail.com");
		dto.setPhone(9900990000l);
		dto.setSoftwareName("XYZ");
		dto.setVersion(11);
		dto.setDoe("feb 14th");
		dto.setPassword("xyz123");
		dto.setPrice(899);
		dto.setOsVersion("Windows 11");
		dto.setId(10);
		
		System.out.println(dto.toString());
		
		SoftwareProductService service = new SoftwareProductServiceImpl();
		//service.validation(dto);
		//service.search(11);	
	//service.search("Norton AnNtiVirus");
		//service.update(15, 20, "Windows 11");
	
		//service.readAll();
		service.delete("XYZ");
		
		
		

	}

}
