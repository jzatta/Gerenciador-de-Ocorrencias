package br.inf.ocorrecia.teste;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

import br.inf.ocorrecia.*;


public class TesteCadastroFuncionario {
	
	Gerenciador gerenciador;
	
	@Before
	public void fixtureSetup() {
		gerenciador = new Gerenciador();
	}
	
	@Test
	public void semFuncionarioCadastrado() throws Exception {
		List<Funcionario> funcs = gerenciador.obterFuncionarios();
		assertEquals(0, funcs.size());
	}
	
	@Test
	public void CadastrarJuliano() throws Exception {
		Funcionario juliano = new Funcionario(1, "Juliano");
		Gerenciador gerenciador = new Gerenciador();
		gerenciador.cadastrarFuncionario(juliano);
		List<Funcionario> funcs = gerenciador.obterFuncionarios();
		assertEquals(1, funcs.size());
		assertEquals(juliano, funcs.get(0));
	}
	
	@Test(expected=UsuarioJaCadastradoException.class)
	public void cadastrarFuncionariosIguais() throws Exception {
		Funcionario juliano0 = new Funcionario(0, "Juliano");
		Funcionario juliano1 = new Funcionario(0, "Juliano");
		gerenciador.cadastrarFuncionario(juliano0);
		gerenciador.cadastrarFuncionario(juliano1);
	}
}
