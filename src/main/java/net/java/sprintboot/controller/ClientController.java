package net.java.sprintboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import net.java.sprintboot.controller.api.model.ClientDTO;
import net.java.sprintboot.controller.api.model.ClientRequestDTO;
import net.java.sprintboot.controller.mapper.ClientMapper;
import net.java.sprintboot.model.service.ClientService;

@RestController
@RequestMapping(path = "/api/v1")
public class ClientController {

	@Autowired
	private ClientService service;
	
	@Autowired
	private ClientMapper mapper;
	
	@PostMapping(path = "/clients", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ClientDTO createClient(@RequestBody ClientRequestDTO request) {
		return this.mapper.toClientDTO(this.service.registerClient(request));
	}
	
	@GetMapping(path = "/clients", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<ClientDTO>> fetchAllClients() {
		List<ClientDTO> responses = this.mapper.toClientsDTO(this.service.getAllClients());
		return ResponseEntity.ok(responses);
	}
}
