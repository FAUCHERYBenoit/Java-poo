package com.ipi.javapoo.database_api.repository;

import com.ipi.javapoo.database_api.entities.Banque;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BanqueRepository extends CrudRepository<Banque, Integer> {

}
