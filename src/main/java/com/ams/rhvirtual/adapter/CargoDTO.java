package com.ams.rhvirtual.adapter;

import java.math.BigDecimal;

import javax.validation.constraints.NotBlank;

public class CargoDTO {

	@NotBlank
	private String nome;
	@NotBlank
	private String descricao;
	@NotBlank
	private BigDecimal salario;	
}
