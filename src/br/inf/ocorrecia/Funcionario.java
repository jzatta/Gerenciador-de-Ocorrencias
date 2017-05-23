package br.inf.ocorrecia;

public class Funcionario {
	int uid;
	String nome;
	
	public Funcionario(int _uid, String _nome) {
		this.nome = _nome;
		this.uid = _uid;
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
}
