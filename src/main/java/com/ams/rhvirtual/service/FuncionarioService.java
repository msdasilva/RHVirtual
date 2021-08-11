package com.ams.rhvirtual.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ams.rhvirtual.enums.Ativo;
import com.ams.rhvirtual.model.Funcionario;
import com.ams.rhvirtual.repository.FuncionarioRepository;

@Service
public class FuncionarioService {

	private FuncionarioRepository funcionarioRepository;

	public FuncionarioService(FuncionarioRepository funcionarioRepository) {
		this.funcionarioRepository = funcionarioRepository;
	}

	public List<Funcionario> getAllFuncionarios() {
		return this.funcionarioRepository.findAll();
	}

	public Funcionario salvar(Funcionario funcionario) {
		funcionario.setCreated(LocalDateTime.now());
		funcionario.setAtivo(Ativo.SIM);
		return this.funcionarioRepository.save(funcionario);
	}

}
