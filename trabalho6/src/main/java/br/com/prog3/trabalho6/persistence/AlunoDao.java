package br.com.prog3.trabalho6.persistence;

import java.util.List;

import br.com.prog3.trabalho6.model.Aluno;

public interface AlunoDao {

	public void incluir(Aluno aluno);

	public void excluir(Aluno aluno);

	public void alterar(Aluno aluno);

	public List<Aluno> listarTodos();

	public Aluno buscarPelaMatricula(int matricula);
}
