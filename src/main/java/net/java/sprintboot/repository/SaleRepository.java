package net.java.sprintboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.java.sprintboot.model.entity.Sale;

@Repository
public interface SaleRepository extends JpaRepository<Sale, Integer> {

}
