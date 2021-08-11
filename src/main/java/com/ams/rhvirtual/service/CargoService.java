package com.ams.rhvirtual.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import com.ams.rhvirtual.enums.Ativo;
import com.ams.rhvirtual.model.Cargo;
import com.ams.rhvirtual.repository.CargoRepository;

@Service
public class CargoService {

	private CargoRepository cargoRepository;

	public CargoService(CargoRepository cargoRepository) {
		this.cargoRepository = cargoRepository;
	}

	public List<Cargo> getAllCargos() {
		return this.cargoRepository.findAll();
	}

	public Cargo salvar(Cargo cargo) {
		cargo.setCreated(LocalDateTime.now());
		cargo.setAtivo(Ativo.SIM);
		return this.cargoRepository.save(cargo);
	}

}
