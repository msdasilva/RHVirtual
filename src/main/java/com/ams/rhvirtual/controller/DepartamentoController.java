package com.ams.rhvirtual.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ams.rhvirtual.model.Departamento;
import com.ams.rhvirtual.service.DepartamentoService;

@RestController
public class DepartamentoController {

	private DepartamentoService departamentoService;

	@GetMapping
	public ResponseEntity<List<Departamento>> getAllDepartamentos() {
		if (this.departamentoService.getAllDepartamentos().isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(departamentoService.getAllDepartamentos());
	}
}
