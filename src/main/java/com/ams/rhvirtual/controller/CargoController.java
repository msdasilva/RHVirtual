package com.ams.rhvirtual.controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ams.rhvirtual.model.Cargo;
import com.ams.rhvirtual.service.CargoService;

@RestController
@RequestMapping("/api/v1/cargos")
public class CargoController {

	private CargoService cargoService;

	public CargoController(CargoService cargoService) {
		this.cargoService = cargoService;
	}

	@GetMapping
	public ResponseEntity<List<Cargo>> getAllCargos() {
		if (this.cargoService.getAllCargos().isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(cargoService.getAllCargos());
	}

}
