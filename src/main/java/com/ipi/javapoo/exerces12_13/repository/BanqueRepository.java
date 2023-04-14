package com.ipi.javapoo.exerces12_13.repository;

import com.ipi.javapoo.exerces12_13.entities.Banque;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BanqueRepository extends CrudRepository<Banque, Integer> {

}
