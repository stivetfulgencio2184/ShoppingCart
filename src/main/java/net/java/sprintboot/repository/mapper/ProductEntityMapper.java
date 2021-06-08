package net.java.sprintboot.repository.mapper;

import org.mapstruct.Mapper;

import net.java.sprintboot.controller.api.model.ProductRequestDTO;
import net.java.sprintboot.model.entity.Product;

@Mapper
public interface ProductEntityMapper {

	public Product toClient(ProductRequestDTO productDTO);
}
