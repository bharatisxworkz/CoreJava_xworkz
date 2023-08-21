package com.xworkz.softwareproduct3.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import lombok.Data;

@Data
public class SoftwareProduct3DTO {

	@Size(min=1,max=5)
	@NotEmpty
	@NotBlank
	@NotNull
	private String userName;
	
	@Size(min=1,max=5)
	@NotEmpty
	@NotBlank
	@NotNull
	private String email;
	
	@Size(min=1,max=5)
	@NotEmpty
	@NotBlank
	@NotNull
	private String softwareName;
	
	@Size(min=1,max=5)
	@NotEmpty
	@NotBlank
	@NotNull
	private String version;

}
