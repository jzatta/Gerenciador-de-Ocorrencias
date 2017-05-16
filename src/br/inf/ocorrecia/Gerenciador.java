package br.inf.ocorrecia;

public class Gerenciador {

	int quantFuncionario;
	
	public Gerenciador() {
		quantFuncionario = 0;
	}
	
	public int quantFuncionarios() {
		return quantFuncionario;
	}

	public boolean cadastraFuncionario() {
		quantFuncionario++;
		return true;
	}

}
