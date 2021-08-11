package com.ams.rhvirtual.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ams.rhvirtual.model.Departamento;
import com.ams.rhvirtual.repository.DepartamentoRepository;

@Service
public class DepartamentoService {

	private DepartamentoRepository departamentoReposity;

	public List<Departamento> getAllDepartamentos() {
		return departamentoReposity.findAll();
	}

}
