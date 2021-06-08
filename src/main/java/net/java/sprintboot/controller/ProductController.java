package net.java.sprintboot.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.java.sprintboot.controller.api.model.ProductDTO;
import net.java.sprintboot.controller.api.model.ProductRequestDTO;
import net.java.sprintboot.controller.mapper.ProductMapper;
import net.java.sprintboot.model.service.ProductService;

@RestController
@RequestMapping(path = "/api/v1")
public class ProductController {
	
	@Autowired
	private ProductService service;
	
	@Autowired
	private ProductMapper mapper;

	@PostMapping(path = "/products", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ProductDTO createClient(@RequestBody ProductRequestDTO request) {
		return this.mapper.toProductDTO(this.service.registerProduct(request));
	}
	
	@PutMapping(path = "/products/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<ProductDTO> updateProduct(@PathVariable(value = "id") Integer id,
			@RequestBody ProductRequestDTO productDetails) {
		ProductDTO response = this.mapper.toProductDTO(this.service.updateProduct(id, productDetails));
		return ResponseEntity.ok(response);
	}
	
	@DeleteMapping(path = "/products/{id}")
	public Map<String, Boolean> deleteProduct(@PathVariable(value = "id") Integer id) {
		this.service.deleteProduct(id);
		Map<String, Boolean> response = new HashMap<>();
		response.put("delete", Boolean.TRUE);
		return response;
	}
}
