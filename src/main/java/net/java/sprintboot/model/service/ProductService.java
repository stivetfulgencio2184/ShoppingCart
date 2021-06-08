package net.java.sprintboot.model.service;

import net.java.sprintboot.controller.api.model.ProductRequestDTO;
import net.java.sprintboot.model.entity.Product;

public interface ProductService {

	public Product registerProduct(ProductRequestDTO newProduct);
	
	public Product updateProduct(Integer id, ProductRequestDTO newProduct);
	
	public void deleteProduct(Integer id);
}
