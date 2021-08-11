package com.ams.rhvirtual.adapter;

import javax.validation.constraints.NotBlank;

public class FuncionarioDTO {

	@NotBlank
	private String nome;
	@NotBlank
	private String sexo;
	@NotBlank
	private String cpf;
}
