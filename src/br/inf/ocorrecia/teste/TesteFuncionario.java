package br.inf.ocorrecia.teste;

import static org.junit.Assert.*;

import org.junit.Test;

import br.inf.ocorrecia.Funcionario;

public class TesteFuncionario {
	
	@Test
	public void juliano() throws Exception {
		Funcionario juliano = new Funcionario(1, "Juliano");
		assertEquals("Juliano", juliano.toString());
	}
	
	@Test
	public void igualdade() throws Exception {
		Funcionario juliano0 = new Funcionario(1, "Juliano");
		Funcionario juliano1 = new Funcionario(2, "Lucas");
		Funcionario lucas = new Funcionario(1, "Lucas");
		assertNotEquals(juliano0, juliano1);
		assertEquals(juliano0, lucas);
	}
}
