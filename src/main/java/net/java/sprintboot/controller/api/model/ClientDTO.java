package net.java.sprintboot.controller.api.model;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ClientDTO {

	private String names;
	
	private String surnames;
	
	private String dni;
	
	private String phone;
	
	private String email;
}
