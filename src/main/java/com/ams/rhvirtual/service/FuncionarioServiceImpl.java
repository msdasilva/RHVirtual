package com.ams.rhvirtual.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.ams.rhvirtual.enums.Ativo;
import com.ams.rhvirtual.model.Funcionario;
import com.ams.rhvirtual.repository.FuncionarioRepository;

@Service
public class FuncionarioServiceImpl implements FuncionarioService {

	private FuncionarioRepository funcionarioRepository;

	public FuncionarioServiceImpl(FuncionarioRepository funcionarioRepository) {
		this.funcionarioRepository = funcionarioRepository;
	}

	@Override
	public List<Funcionario> getAllFuncionarios(Pageable page) {
		return this.funcionarioRepository.findAll(page).getContent();
	}

	@Override
	public Funcionario salvar(Funcionario funcionario) {
		funcionario.setCreated(LocalDateTime.now());
		funcionario.setAtivo(Ativo.SIM);
		return this.funcionarioRepository.save(funcionario);
	}

	@Override
	public void deleteById(Long funcionarioId) {
		this.funcionarioRepository.deleteById(funcionarioId);

	}

	@Override
	public Optional<Funcionario> findById(Long funcionarioId) {
		return this.funcionarioRepository.findById(funcionarioId);
	}

}
