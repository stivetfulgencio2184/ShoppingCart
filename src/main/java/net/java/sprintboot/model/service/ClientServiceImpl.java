package net.java.sprintboot.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.java.sprintboot.controller.api.model.ClientRequestDTO;
import net.java.sprintboot.model.entity.Client;
import net.java.sprintboot.repository.ClientRepository;
import net.java.sprintboot.repository.mapper.ClientEntityMapper;

@Service
public class ClientServiceImpl implements ClientService {

	@Autowired
	private ClientRepository repository;
	
	@Autowired
	private ClientEntityMapper mapper;
	
	@Override
	public Client registerClient(ClientRequestDTO newClient) {
		return this.repository.save(this.mapper.toClient(newClient));
	}

	@Override
	public List<Client> getAllClients() {
		return this.repository.findAll();
	}

}
