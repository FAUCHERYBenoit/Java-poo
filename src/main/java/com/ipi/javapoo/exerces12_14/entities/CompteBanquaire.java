package com.ipi.javapoo.exerces12_14.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "compte_banquaire")
public class CompteBanquaire {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "id", nullable = false)
	private Long id;
	
	@ManyToOne
	@JoinColumn(name = "id_client")
	private Client client;
	
	@ManyToOne
	@JoinColumn(name = "id_banque")
	private Banque banque;
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
}
