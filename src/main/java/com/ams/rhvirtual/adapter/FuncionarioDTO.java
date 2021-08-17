package com.ams.rhvirtual.adapter;

import java.time.LocalDate;

import javax.validation.constraints.NotBlank;

public class FuncionarioDTO {

	@NotBlank(message = "O campo nome deve ser preenchido.")
	private String nome;

	@NotBlank(message = "O campo sexo deve ser preenchido.")
	private String sexo;

	@NotBlank(message = "O campo cpf deve ser preenchido.")
	private String cpf;
	
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
