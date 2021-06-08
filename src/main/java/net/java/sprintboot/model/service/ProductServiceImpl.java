package net.java.sprintboot.model.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.java.sprintboot.controller.api.model.ProductRequestDTO;
import net.java.sprintboot.model.entity.Product;
import net.java.sprintboot.repository.ProductRepository;
import net.java.sprintboot.repository.mapper.ProductEntityMapper;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository repository;
	
	@Autowired
	private ProductEntityMapper mapper;
	
	@Override
	public Product registerProduct(ProductRequestDTO newProduct) {
		return this.repository.save(this.mapper.toClient(newProduct));
	}

	@Override
	public Product updateProduct(Integer id, ProductRequestDTO productUpdated) {
		Product changes = this.mapper.toClient(productUpdated);
		Product product = this.repository.getById(id);
		
		product.setName(changes.getName());
		product.setPrice(changes.getPrice());
		return this.repository.save(product);
	}

	@Override
	public void deleteProduct(Integer id) {
		this.repository.deleteById(id);
	}	

}
