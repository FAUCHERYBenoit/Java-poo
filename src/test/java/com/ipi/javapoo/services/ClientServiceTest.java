package com.ipi.javapoo.services;

import com.ipi.javapoo.exerces12_13.entities.Client;
import com.ipi.javapoo.exerces12_13.repository.ClientRepository;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.Objects;

@ExtendWith(SpringExtension.class)
@DataJpaTest
public class ClientServiceTest {
	@Autowired
	private ClientRepository repository;
	
	@Test
	void setAndGetClient() {
		Client client = new Client();
		client.setNom("FAUCHERY");
		client.setPrenom("Benoît");
		repository.save(client);

		Assertions.assertThat(repository.findAll().size() == 1);
		Assertions.assertThat(Objects.equals(repository.findAll().get(0).getNom(), client.getNom()));
	}
	
}
