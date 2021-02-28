package br.edu.ifpr.model;

import java.util.Comparator;


public class Usuario implements Comparator<Usuario>{
	
	private static Integer nextId = 1;
	private Integer id;
	private String nome;
	private Integer pontos;
	private boolean moderador;

	public Usuario(String nome, Integer pontos) {
		this.id = nextId++;
		this.nome = nome;
		this.pontos = pontos;
		this.moderador = false;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getPontos() {
		return pontos;
	}

	public void setPontos(Integer pontos) {
		this.pontos = pontos;
	}

	public boolean isModerador() {
		return moderador;
	}

	public void setModerador(boolean moderador) {
		this.moderador = moderador;
	}

	public Integer getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", nome=" + nome + ", pontos=" + pontos + ", moderador=" + moderador + "]";
	}

	@Override
	public int compare(Usuario o1, Usuario o2) {
		
		return 0;
	}

	
	
	
}
