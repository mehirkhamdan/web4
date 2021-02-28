package br.edu.ifpr.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


public class Candidato implements Comparator<Candidato>, Comparable<Candidato>{
	

	private String conceito;
	private Integer anoNascimento;
	private Float rendaMensal;
	

	public Candidato(String conceito, Integer anoNascimento, Float rendaMensal) {
		this.conceito = conceito;
		this.anoNascimento = anoNascimento;
		this.rendaMensal = rendaMensal;
	}


	public String getConceito() {
		return conceito;
	}


	public void setConceito(String conceito) {
		this.conceito = conceito;
	}


	public Integer getAnoNascimento() {
		return anoNascimento;
	}


	public void setAnoNascimento(Integer anoNascimento) {
		this.anoNascimento = anoNascimento;
	}
	
	public Float getRendaMensal() {
		return rendaMensal;
	}
	
	public void setRendaMensal(Float rendaMensal) {
		this.rendaMensal = rendaMensal;		
	}
	
		
	@Override
	public String toString() {
		return "Candidato [conceito=" + conceito + ", anoNascimento=" + anoNascimento + ", rendaMensal=" + rendaMensal
				+ "]";
	}


	@Override
	public int compareTo(Candidato o) {
		
		  return (this.conceito + this.anoNascimento).compareTo(o.conceito + o.anoNascimento);
		
	}
	
	@Override
	public int compare(Candidato o1, Candidato o2) {
		
		return (o1.getConceito()+ o1.getAnoNascimento()).compareTo(o2.getConceito() + o2.getAnoNascimento());
	}	
	
}
