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

import com.ams.rhvirtual.adapter.DepartamentoDTO;
import com.ams.rhvirtual.model.Departamento;
import com.ams.rhvirtual.service.DepartamentoService;

@RestController
@RequestMapping("/api/v1/departamentos")
public class DepartamentoController {

	private DepartamentoService departamentoService;

	public DepartamentoController(DepartamentoService departamentoService) {
		this.departamentoService = departamentoService;
	}

	@GetMapping
	public ResponseEntity<List<Departamento>> getAllDepartamentos() {
		if (this.departamentoService.getAllDepartamentos().isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(this.departamentoService.getAllDepartamentos());
	}

	@PostMapping
	public ResponseEntity<Departamento> salvar(@RequestBody @Valid DepartamentoDTO departamentoDTO) {
		var departamento = new Departamento();
		BeanUtils.copyProperties(departamentoDTO, departamento);
		this.departamentoService.salvar(departamento);
		return new ResponseEntity<>(departamento, HttpStatus.CREATED);
	}

}
