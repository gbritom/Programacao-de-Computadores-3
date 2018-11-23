package br.com.prog3.trabalho6.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.Proxy;

@Entity
@Table(name = "aluno")
@Proxy(lazy = false)
public class Aluno implements Serializable {
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name = "matricula")
	private int matricula;
	@Column(name = "nome")
	private String nome;
	@Column(name = "ra")
	private String ra;

	public int getMatricula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getRa() {
		return ra;
	}

	public void setRa(String ra) {
		this.ra = ra;
	}
}
