package com.ipi.javapoo.exerces12_14.dtos;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ClientDTO {
	private Integer id;
	private String nom;
	private String prenom;
}
