package com.ipi.javapoo.database_api.repository;

import com.ipi.javapoo.database_api.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Integer> {

}
