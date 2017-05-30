package br.inf.ocorrecia;

import java.util.LinkedList;
import java.util.List;


public class Gerenciador {

	List<Funcionario> funcionarios;
	
	public Gerenciador() {
		funcionarios = new LinkedList<Funcionario>();
	}

	public List<Funcionario> obterFuncionarios() {
		return funcionarios;
	}

	public void cadastrarFuncionario(Funcionario func) throws UsuarioJaCadastradoException {
		for (Funcionario f : funcionarios) {
			if (func.equals(f)) {
				throw new UsuarioJaCadastradoException();
			}
		}
		funcionarios.add(func);
	}

}
