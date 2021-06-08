package net.java.sprintboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.java.sprintboot.model.Client;

@Repository
public interface ClientRepository extends JpaRepository<Client, Integer> {

}
