package com.ams.rhvirtual.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ams.rhvirtual.enums.Ativo;
import com.ams.rhvirtual.model.Departamento;
import com.ams.rhvirtual.repository.DepartamentoRepository;

@Service
public class DepartamentoService {

	private DepartamentoRepository departamentoReposity;

	public DepartamentoService(DepartamentoRepository departamentoReposity) {
		this.departamentoReposity = departamentoReposity;
	}

	public List<Departamento> getAllDepartamentos() {
		return this.departamentoReposity.findAll();
	}

	public Departamento salvar(Departamento departamento) {
		departamento.setCreated(LocalDateTime.now());
		departamento.setAtivo(Ativo.SIM);
		return this.departamentoReposity.save(departamento);
	}

}
