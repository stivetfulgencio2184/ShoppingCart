package net.java.sprintboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.java.sprintboot.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {

}
