package net.java.sprintboot.controller.api.model;

import java.math.BigDecimal;

import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class ProductRequestDTO {

	private String name;
	
	private BigDecimal price; 
}
