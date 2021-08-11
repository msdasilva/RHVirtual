package com.ams.rhvirtual.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ams.rhvirtual.model.Funcionario;
import com.ams.rhvirtual.repository.FuncionarioRepository;

@Service
public class FuncionarioService {

	private FuncionarioRepository funcionarioRepository;

	public List<Funcionario> getAllFuncionarios() {
		return funcionarioRepository.findAll();
	}

}
