package br.inf.ocorrecia.teste;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import br.inf.ocorrecia.Funcionario;
import br.inf.ocorrecia.Ocorrencia;
import br.inf.ocorrecia.Prioridade;
import br.inf.ocorrecia.TipoOcorrencia;

public class TesteOcorrencia {

	Ocorrencia ocorrencia;
	Funcionario func;
	
	@Before
	public void setup() {
		func = new Funcionario(0, "Juliano");
		ocorrencia = new Ocorrencia(TipoOcorrencia.TAREFA, Prioridade.ALTA,
				"Tarefa - Alta Fazer...", func);
	}
	
	@Test
	public void tarefaAlta() throws Exception {
		assertEquals(TipoOcorrencia.TAREFA, ocorrencia.tipo());
		assertEquals(Prioridade.ALTA, ocorrencia.prioridade());
		assertEquals("Tarefa - Alta Fazer...", ocorrencia.resumo());
	}
	
	@Test
	public void resumo() throws Exception {
		assertEquals("Tarefa - Alta Fazer...", ocorrencia.resumo());
	}
	
	@Test
	public void funcionario() throws Exception {
		assertEquals(func, ocorrencia.responsavel());
	}
	
	@Test
	public void alteracaoPrioridade() throws Exception {
		ocorrencia.alteraPrioridade(Prioridade.BAIXA);
		assertEquals(Prioridade.BAIXA, ocorrencia.prioridade());
	}
	
	@Test
	public void alteracaoPrioridadeOcorrenciaFinalizada() throws Exception {
		ocorrencia.finaliza();
		ocorrencia.alteraPrioridade(Prioridade.BAIXA);
		assertEquals(Prioridade.ALTA, ocorrencia.prioridade());
	}
	
	@Test
	public void finalizacao() throws Exception {
		assertFalse(ocorrencia.finalizado());
		ocorrencia.finaliza();
		assertTrue(ocorrencia.finalizado());
	}
	
	@Test
	public void alretaResponsavel() throws Exception {
		Funcionario f = new Funcionario(0, "Juliano");
		ocorrencia.alteraResponsavel(f);
		assertEquals(f, ocorrencia.responsavel());
	}
	
	
}
