package com.ams.rhvirtual.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ams.rhvirtual.adapter.FuncionarioDTO;
import com.ams.rhvirtual.model.Funcionario;
import com.ams.rhvirtual.service.FuncionarioService;

@RestController
@RequestMapping("/api/v1/funcionarios")
public class FuncionarioController {

	private FuncionarioService funcionarioService;

	public FuncionarioController(FuncionarioService funcionarioService) {
		this.funcionarioService = funcionarioService;
	}

	@GetMapping
	public ResponseEntity<List<Funcionario>> getAllFuncionarios() {
		if (this.funcionarioService.getAllFuncionarios().isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(this.funcionarioService.getAllFuncionarios());
	}

	@PostMapping
	public ResponseEntity<Funcionario> salvar(@RequestBody @Valid FuncionarioDTO funcionarioDTO) {
		var funcionario = new Funcionario();
		BeanUtils.copyProperties(funcionarioDTO, funcionario);
		this.funcionarioService.salvar(funcionario);
		return new ResponseEntity<>(funcionario, HttpStatus.CREATED);
	}
}
