package com.ams.rhvirtual.adapter;

import java.time.LocalDate;

import javax.validation.constraints.NotBlank;

public class FuncionarioDTO {

	@NotBlank
	private String nome;
	@NotBlank
	private String sexo;
	@NotBlank
	private String cpf;
	@NotBlank
	private LocalDate dataNascimento;	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public LocalDate getDataNascimento() {
		return dataNascimento;
	}
	public void setDataNascimento(LocalDate dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
	
	
}
