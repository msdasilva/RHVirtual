package com.ams.rhvirtual.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ams.rhvirtual.model.Funcionario;
import com.ams.rhvirtual.service.FuncionarioService;

@RestController
public class FuncionarioController {

	private FuncionarioService funcionarioService;

	@GetMapping
	public ResponseEntity<List<Funcionario>> getAllFuncionarios() {
		if (this.funcionarioService.getAllFuncionarios().isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(funcionarioService.getAllFuncionarios());
	}
}
