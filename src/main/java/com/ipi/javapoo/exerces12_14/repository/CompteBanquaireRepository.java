package com.ipi.javapoo.exerces12_14.repository;

import com.ipi.javapoo.exerces12_14.entities.CompteBanquaire;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompteBanquaireRepository extends CrudRepository<CompteBanquaire, Integer> {

}
