package br.inf.ocorrecia.teste;

import static org.junit.Assert.*;

import org.junit.Test;

import br.inf.ocorrecia.Gerenciador;

public class testeCadastro {

	@Test
	public void testeGerenciador() throws Exception {
		Gerenciador gerenciador = new Gerenciador();
		assertEquals(0, gerenciador.quantFuncionarios());
	}
	
	@Test
	public void testeCadastraUmFuncionario() throws Exception {
		Gerenciador gerenciador = new Gerenciador();
		gerenciador.cadastraFuncionario();
		assertEquals(1, gerenciador.quantFuncionarios());
	}
	
	
}
