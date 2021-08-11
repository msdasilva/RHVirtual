package com.ams.rhvirtual.adapter;

import javax.validation.constraints.NotBlank;

public class DepartamentoDTO {

	@NotBlank
	private String nome;
	@NotBlank
	private String localizacao;
}
