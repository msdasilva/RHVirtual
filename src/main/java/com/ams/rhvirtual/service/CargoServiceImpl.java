package com.ams.rhvirtual.service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.ams.rhvirtual.enums.Ativo;
import com.ams.rhvirtual.model.Cargo;
import com.ams.rhvirtual.repository.CargoRepository;

@Service
public class CargoServiceImpl implements CargoService {

	private CargoRepository cargoRepository;

	public CargoServiceImpl(CargoRepository cargoRepository) {
		this.cargoRepository = cargoRepository;
	}

	@Override
	public List<Cargo> getAllCargos(Pageable page) {
		return this.cargoRepository.findAll(page).getContent();
	}

	@Override
	public Cargo salvar(Cargo cargo) {
		cargo.setCreated(LocalDateTime.now());
		cargo.setAtivo(Ativo.SIM);
		return this.cargoRepository.save(cargo);
	}

	@Override
	public void deleteById(Long cargoId) {
		this.cargoRepository.deleteById(cargoId);

	}

	@Override
	public Optional<Cargo> findById(Long cargoId) {
		return this.cargoRepository.findById(cargoId);
	}

}
