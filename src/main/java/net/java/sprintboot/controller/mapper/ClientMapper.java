package net.java.sprintboot.controller.mapper;

import java.util.List;

import org.mapstruct.Mapper;

import net.java.sprintboot.controller.api.model.ClientDTO;
import net.java.sprintboot.controller.api.model.ClientRequestDTO;
import net.java.sprintboot.model.entity.Client;

@Mapper
public interface ClientMapper {
	
	public ClientDTO toClientDTO(Client client);
	
	public List<ClientDTO> toClientsDTO(List<Client> clients);
}
