package com.ams.rhvirtual;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.math.BigDecimal;

import org.aspectj.lang.annotation.Before;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.support.DependencyInjectionTestExecutionListener;

import com.ams.rhvirtual.model.Cargo;
import com.ams.rhvirtual.model.Departamento;
import com.ams.rhvirtual.model.Funcionario;
import com.ams.rhvirtual.service.CargoService;
import com.ams.rhvirtual.service.DepartamentoService;
import com.ams.rhvirtual.service.FuncionarioService;

@SpringBootTest(classes = { FuncionarioService.class, CargoService.class, DepartamentoService.class })
@TestExecutionListeners({ DependencyInjectionTestExecutionListener.class })
@ActiveProfiles("test")

public class RhvirtualJavaApiUnitTests {

	@Autowired
	private FuncionarioService funcionarioService;

	@Autowired
	private CargoService cargoService;

	@Autowired
	private DepartamentoService departamentoService;

	@Before(value = "")
	public void setUp() {
		funcionarioService.getAllFuncionarios();
		cargoService.getAllCargos();
		departamentoService.getAllDepartamentos();
	}

	@Test
	public void shouldReturnNotNullTravelService() {
		assertNotNull(funcionarioService);
		assertNotNull(cargoService);
		assertNotNull(departamentoService);
	}

	@Test
	public void shouldReturnFuncionarioCreatedWithSuccess() throws Exception {

		var funcionario = new Funcionario();
		funcionario.setCpf("1234567");
		funcionario.setNome("Ricardo");
		funcionario.setSexo("M");
		var funcionarioSalvo = funcionarioService.salvar(funcionario);

		assertNotNull(funcionarioSalvo);
		assertEquals(funcionario.getCpf(), funcionarioSalvo.getCpf());
		assertEquals(funcionario.getNome(), funcionarioSalvo.getNome());
		assertEquals(funcionario.getSexo(), funcionarioSalvo.getSexo());

	}

	@Test
	public void shouldReturnCargoCreatedWithSuccess() throws Exception {

		var cargo = new Cargo();
		cargo.setDescricao("1234567");
		cargo.setNome("Ricardo");
		cargo.setSalario(new BigDecimal(8500.00));
		var cargoSalvo = cargoService.salvar(cargo);

		assertNotNull(cargoSalvo);
		assertEquals(cargo.getNome(), cargoSalvo.getNome());
		assertEquals(cargo.getDescricao(), cargoSalvo.getDescricao());
		assertEquals(cargo.getSalario(), cargoSalvo.getSalario());

	}

	@Test
	public void shouldReturnDepartamentoCreatedWithSuccess() throws Exception {

		var departamento = new Departamento();
		departamento.setLocalizacao("1234567");
		departamento.setNome("Fiscal");
		var departamentoSalvo = departamentoService.salvar(departamento);

		assertNotNull(departamentoSalvo);
		assertEquals(departamento.getNome(), departamentoSalvo.getNome());
		assertEquals(departamento.getLocalizacao(), departamentoSalvo.getLocalizacao());

	}
}
