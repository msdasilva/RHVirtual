package com.ams.rhvirtual.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.BeanUtils;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ams.rhvirtual.adapter.CargoDTO;
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
	@Cacheable("cargos")
	public ResponseEntity<List<Cargo>> getAllCargos(
			@PageableDefault(sort = "nome", direction = Sort.Direction.ASC, page = 0, size = 10) Pageable page) {
		if (this.cargoService.getAllCargos(page).isEmpty()) {
			return ResponseEntity.notFound().build();
		}
		return ResponseEntity.ok(this.cargoService.getAllCargos(page));
	}

	@PostMapping
	public ResponseEntity<Cargo> salvar(@RequestBody @Valid CargoDTO cargoDTO) {
		var cargo = new Cargo();
		BeanUtils.copyProperties(cargoDTO, cargo);
		this.cargoService.salvar(cargo);
		return new ResponseEntity<>(cargo, HttpStatus.CREATED);
	}

}
