package com.ipi.javapoo.database_api.repository;

import com.ipi.javapoo.database_api.entities.CompteBanquaire;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompteBanquaireRepository extends CrudRepository<CompteBanquaire, Integer> {

}
