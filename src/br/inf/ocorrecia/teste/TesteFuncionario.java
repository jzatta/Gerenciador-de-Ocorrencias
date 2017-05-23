package br.inf.ocorrecia.teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.inf.ocorrecia.Funcionario;
import br.inf.ocorrecia.Ocorrencia;
import br.inf.ocorrecia.MaximoOcorrenciasAlcancadoException;

public class TesteFuncionario {
	
	Funcionario juliano;
	
	@Before
	public void setup() {
		juliano = new Funcionario(0, "Juliano");
	}
	
	@Test
	public void juliano() throws Exception {
		assertEquals("Juliano", juliano.toString());
	}
	
	@Test
	public void igualdade() throws Exception {
		Funcionario juliano1 = new Funcionario(1, "Juliano");
		Funcionario lucas = new Funcionario(0, "Lucas");
		assertNotEquals(juliano, juliano1);
		assertEquals(juliano, lucas);
	}
	
	@Test
	public void adicionaOcorrencia() throws Exception {
		Ocorrencia o = new Ocorrencia(null, null, null, juliano);
		juliano.adicionaOcorrencia(o);
		assertEquals(juliano.ocorrencia(0), o);
	}
	
	@Test
	public void quantidadeOcorrencias() throws Exception {
		Ocorrencia o = new Ocorrencia(null, null, null, juliano);
		assertEquals(0, juliano.quantidadeOcorrencias());
		juliano.adicionaOcorrencia(o);
		assertEquals(1, juliano.quantidadeOcorrencias());
	}
	
	@Test(expected=MaximoOcorrenciasAlcancadoException.class)
	public void adicionaMaisDeDezOcorrencias() throws Exception {
		Ocorrencia o = new Ocorrencia(null, null, null, juliano);
		juliano.adicionaOcorrencia(o);
		juliano.adicionaOcorrencia(o);
		juliano.adicionaOcorrencia(o);
		juliano.adicionaOcorrencia(o);
		juliano.adicionaOcorrencia(o);
		juliano.adicionaOcorrencia(o);
		juliano.adicionaOcorrencia(o);
		juliano.adicionaOcorrencia(o);
		juliano.adicionaOcorrencia(o);
		juliano.adicionaOcorrencia(o);
		juliano.adicionaOcorrencia(o); // 11
	}
	
	@Test
	public void removeOcorrencia() throws Exception {
		Ocorrencia o = new Ocorrencia(null, null, null, juliano);
		juliano.adicionaOcorrencia(o);
		juliano.removeOcorrencia(o);
		assertEquals(0, juliano.quantidadeOcorrencias());
	}
}
