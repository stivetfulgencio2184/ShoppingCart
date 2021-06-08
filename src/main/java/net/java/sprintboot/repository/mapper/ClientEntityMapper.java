package net.java.sprintboot.repository.mapper;

import org.mapstruct.Mapper;

import net.java.sprintboot.controller.api.model.ClientRequestDTO;
import net.java.sprintboot.model.entity.Client;

@Mapper
public interface ClientEntityMapper {

	public Client toClient(ClientRequestDTO clientDTO);
}
