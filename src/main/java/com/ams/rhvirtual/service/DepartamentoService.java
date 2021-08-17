package com.ams.rhvirtual.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Pageable;

import com.ams.rhvirtual.model.Departamento;

public interface DepartamentoService {

	List<Departamento> getAllDepartamentos(Pageable page);

	Departamento salvar(Departamento departamento);

	void deleteById(Long departamentoId);

	Optional<Departamento> findById(Long departamentoId);
}
