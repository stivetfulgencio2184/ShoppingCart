package net.java.sprintboot.model.service;

import java.util.List;

import net.java.sprintboot.controller.api.model.ClientRequestDTO;
import net.java.sprintboot.model.entity.Client;

public interface ClientService {

	public Client registerClient(ClientRequestDTO newClient);
	
	public List<Client> getAllClients();
}
