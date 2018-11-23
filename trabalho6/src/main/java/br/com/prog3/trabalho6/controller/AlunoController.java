package br.com.prog3.trabalho6.controller;

import java.util.List;

import javax.faces.bean.ManagedBean;

import br.com.prog3.trabalho6.model.Aluno;
import br.com.prog3.trabalho6.persistence.AlunoDaoImp;

@ManagedBean
public class AlunoController {
	public void incluir(Aluno aluno) {
		AlunoDaoImp ad = new AlunoDaoImp();
		ad.incluir(aluno);
	}

	public void alterar(Aluno aluno) {
		AlunoDaoImp ad = new AlunoDaoImp();
		ad.alterar(aluno);
	}

	public void excluir(Aluno aluno) {
		AlunoDaoImp ad = new AlunoDaoImp();
		ad.excluir(aluno);
	}

	public List<Aluno> listarTodos() {
		AlunoDaoImp ad = new AlunoDaoImp();
		return ad.listarTodos();
	}

	public Aluno buscarPelaMatricula(int matricula) {
		AlunoDaoImp ad = new AlunoDaoImp();
		return ad.buscarPelaMatricula(matricula);
	}
}
