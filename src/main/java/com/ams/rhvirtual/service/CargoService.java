package com.ams.rhvirtual.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.ams.rhvirtual.model.Cargo;
import com.ams.rhvirtual.repository.CargoRepository;

@Service
public class CargoService {

	private CargoRepository cargoRepository;

	public List<Cargo> getAllCargos() {
		return cargoRepository.findAll();
	}

}
