package com.generation.lojagames.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;

	@Entity
	@Table(name = "tb_produtos")
public class Categoria {

		@Id 
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Long id;
		
		@NotBlank(message = "O atributo Genêro é obrigatório!")
		private  String nome;
		
		  @NotBlank(message = "O atributo Genero é obrigatório!")
		    @Size(max = 1000, message = "O atributo Genero deve ter no máximo 1000 caracteres.")
		private  String genero;

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getGenero() {
			return genero;
		}

		public void setGenero(String genero) {
			this.genero = genero;
		}
}
