package com.ams.rhvirtual.adapter;

import javax.validation.constraints.NotBlank;

public class DepartamentoDTO {

	@NotBlank
	private String nome;
	@NotBlank
	private String localizacao;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLocalizacao() {
		return localizacao;
	}
	public void setLocalizacao(String localizacao) {
		this.localizacao = localizacao;
	}
	
	
}
