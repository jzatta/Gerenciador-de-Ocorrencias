package br.inf.ocorrecia;

import java.util.LinkedList;
import java.util.List;

public class Funcionario {
	private static final int MAXOCORRENCIAS = 10;
	private int uid;
	private String nome;
	private List<Ocorrencia> ocorrencias;
	
	public Funcionario(int _uid, String _nome) {
		this.nome = _nome;
		this.uid = _uid;
		ocorrencias = new LinkedList<Ocorrencia>();
	}

	public String toString() {
		return nome;
	}
	
	public boolean equals(Object o) {
		if (o instanceof Funcionario) {
			Funcionario f = (Funcionario) o;
			return (f.uid == this.uid);
		}
		return super.equals(o);
	}

	public void adicionaOcorrencia(Ocorrencia o) {
		if (quantidadeOcorrencias() >= MAXOCORRENCIAS) {
			throw new MaximoOcorrenciasAlcancadoException();
		}
		ocorrencias.add(o);
	}

	public Ocorrencia ocorrencia(int i) {
		return ocorrencias.get(i);
	}

	public int quantidadeOcorrencias() {
		return ocorrencias.size();
	}

	public void removeOcorrencia(Ocorrencia o) {
		ocorrencias.remove(o);
		
	}
}
