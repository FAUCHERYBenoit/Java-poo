package com.ipi.javapoo.exerces12_14.entities;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "banque")
public class Banque {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = false)
	private Long id;
	
	@Column(name = "nom")
	private String nom;
	
	@OneToMany(targetEntity=CompteBanquaire.class, mappedBy="banque" )
	private List<CompteBanquaire> compteBanquaires = new ArrayList<>();
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNom() {
		return nom;
	}
	
	public void setNom(String nom) {
		this.nom = nom;
	}
	
	public List<CompteBanquaire> getCompteBanquaires() {
		return compteBanquaires;
	}
	
	public void setCompteBanquaires(List<CompteBanquaire> compteBanquaires) {
		this.compteBanquaires = compteBanquaires;
	}
	
}
