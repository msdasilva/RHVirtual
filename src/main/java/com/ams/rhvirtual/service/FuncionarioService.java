package com.ams.rhvirtual.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Pageable;

import com.ams.rhvirtual.model.Funcionario;

public interface FuncionarioService {
	List<Funcionario> getAllFuncionarios(Pageable page);

	Funcionario salvar(Funcionario funcionario);

	void deleteById(Long funcionarioId);

	Optional<Funcionario> findById(Long funcionarioId);
}
