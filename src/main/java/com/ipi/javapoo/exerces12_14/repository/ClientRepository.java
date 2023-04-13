package com.ipi.javapoo.exerces12_14.repository;

import com.ipi.javapoo.exerces12_14.entities.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<Client, Integer> {

}
