package net.java.sprintboot.controller.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import net.java.sprintboot.controller.api.model.ProductDTO;
import net.java.sprintboot.model.entity.Product;

@Mapper
public interface ProductMapper {

	public ProductDTO toProductDTO(Product product);
	
	public List<ProductDTO> toProductsDTO(List<Product> clients);
}
