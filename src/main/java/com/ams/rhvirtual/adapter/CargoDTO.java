package com.ams.rhvirtual.adapter;

import java.math.BigDecimal;

import javax.validation.constraints.NotBlank;

public class CargoDTO {

	@NotBlank(message = "O campo nome deve ser preenchido.")
	private String nome;

	@NotBlank(message = "O campo descrição deve ser preenchido.")
	private String descricao;

	private BigDecimal salario;

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

	public BigDecimal getSalario() {
		return salario;
	}

	public void setSalario(BigDecimal salario) {
		this.salario = salario;
	}

}
