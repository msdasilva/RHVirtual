package com.ams.rhvirtual.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.ams.rhvirtual.enums.Ativo;
import com.ams.rhvirtual.model.Departamento;
import com.ams.rhvirtual.repository.DepartamentoRepository;

@Service
public class DepartamentoServiceImpl implements DepartamentoService {

	private DepartamentoRepository departamentoReposity;

	public DepartamentoServiceImpl(DepartamentoRepository departamentoReposity) {
		this.departamentoReposity = departamentoReposity;
	}

	@Override
	public List<Departamento> getAllDepartamentos(Pageable page) {
		return this.departamentoReposity.findAll(page).getContent();
	}

	@Override
	public Departamento salvar(Departamento departamento) {
		departamento.setCreated(LocalDateTime.now());
		departamento.setAtivo(Ativo.SIM);
		return this.departamentoReposity.save(departamento);
	}

	@Override
	public void deleteById(Long departamentoId) {
		this.departamentoReposity.deleteById(departamentoId);
	}

	@Override
	public Optional<Departamento> findById(Long departamentoId) {
		return this.departamentoReposity.findById(departamentoId);
	}

}
