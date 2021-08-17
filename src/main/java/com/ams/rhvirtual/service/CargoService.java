package com.ams.rhvirtual.service;

import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Pageable;

import com.ams.rhvirtual.model.Cargo;

public interface CargoService {

	List<Cargo> getAllCargos(Pageable page);

	Cargo salvar(Cargo cargo);

	void deleteById(Long cargoId);

	Optional<Cargo> findById(Long cargoId);
}
