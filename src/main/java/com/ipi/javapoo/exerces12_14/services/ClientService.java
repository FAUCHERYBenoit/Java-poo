package com.ipi.javapoo.exerces12_14.services;

import com.ipi.javapoo.exerces12_14.entities.Client;
import com.ipi.javapoo.exerces12_14.repository.ClientRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Slf4j
@Service
public class ClientService {
	@Autowired
	private final ClientRepository repository;
	
	public ClientService(ClientRepository repository) {
		this.repository = repository;
	}
	
	public Optional<Client> getClientById (Integer id){
		return this.repository.findById(id);
	}
	
	public void setClient (Client client){
		this.repository.save(client);
	}
}
