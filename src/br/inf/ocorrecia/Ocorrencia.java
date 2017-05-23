package br.inf.ocorrecia;

public class Ocorrencia {

	private TipoOcorrencia tipo;
	private Prioridade p;
	
	boolean finalizado;
	private String resumo;
	private Funcionario responsavel;
	
	public Ocorrencia(TipoOcorrencia _tipo, Prioridade _prioridade, String _resumo, Funcionario _r) {
		tipo = _tipo;
		p = _prioridade;
		finalizado = false;
		resumo = _resumo;
		responsavel = _r;
	}

	public TipoOcorrencia tipo() {
		return tipo;
	}

	public Prioridade prioridade() {
		return p;
	}

	public void alteraPrioridade(Prioridade _p) {
		if (!finalizado)
			p = _p;
	}

	public void finaliza() {
		finalizado = true;
	}

	public boolean finalizado() {
		return finalizado;
	}

	public String resumo() {
		return resumo;
	}

	public Funcionario responsavel() {
		return responsavel;
	}

	public void alteraResponsavel(Funcionario _r) {
		responsavel = _r;
	}

}
