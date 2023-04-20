package com.generation.lojagames.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.PositiveOrZero;
import jakarta.validation.constraints.Size;

	@Entity
	@Table(name = "tb_produtos")
	public class Produto {
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank(message = "O atributo Nome é obrigatório!")
	private  String nome;
	
	  @NotBlank(message = "O atributo Descrição é obrigatório!")
	    @Size(max = 1000, message = "O atributo descrição deve ter no máximo 1000 caracteres.")
	private  String descricao;
	
	  
	  @NotNull
	  @PositiveOrZero
	private  BigDecimal preco;
	
	  @UpdateTimestamp
	private LocalDate datelancamentoO;
	
	  @Size
	private String foto;

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

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public LocalDate getDatelancamentoO() {
		return datelancamentoO;
	}

	public void setDatelancamentoO(LocalDate datelancamentoO) {
		this.datelancamentoO = datelancamentoO;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}
}
