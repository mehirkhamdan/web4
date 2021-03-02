package br.edu.ifpr.main;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;

import br.edu.ifpr.data.DataSource;
import br.edu.ifpr.model.Candidato;
import br.edu.ifpr.model.Movie;
import br.edu.ifpr.model.Usuario;

public class main {

	public static void main(String[] args) {
				
		List<Candidato> candidatos = new ArrayList<>();
		candidatos.add(new Candidato("C", 2010, 1280.50f));
		candidatos.add(new Candidato("B",2004, 1350.00f ));
		candidatos.add(new Candidato("A", 2001, 1145.00f));
		candidatos.add(new Candidato("B", 1999, 980.78f));
		candidatos.add(new Candidato("A", 1999, 1430.25f));
		
		
        System.out.println("Lista original Candidatos:");
	    candidatos.forEach(System.out::println);
	    
	    System.out.println("[1]=====================");	
	    
		System.out.println("Lista ordenada usando Comparable :");
		Collections.sort(candidatos);
		candidatos.forEach(System.out::println);
		
		System.out.println("[2]=====================");	
		
		System.out.println("Filtro por Conceito e  Ano Nascimento:");
		 candidatos.sort(Comparator.comparing(Candidato::getAnoNascimento)
				 .thenComparing(Candidato::getConceito)
	                .thenComparing(Candidato::getRendaMensal));

	        candidatos.forEach(System.out::println);
	        	        
	        System.out.println("[3]=====================");	
	        
		        System.out.println("Filtro por Ano Nascimento e  Renda Mensal:");
				 candidatos.sort(Comparator.comparing(Candidato::getRendaMensal)
			                .thenComparing(Candidato::getConceito )
			                .thenComparing(Candidato::getAnoNascimento));

			        candidatos.forEach(System.out::println);
			        
		   System.out.println("[4]=====================");				        
			        
		   System.out.println("Lista original de Movies:");		  		
	      List<Movie> movies = DataSource.getMovies();		
	      
	      movies.forEach(System.out::println);
	      
	      System.out.println("[5]=====================");
			        
	      System.out.println("Filtro por Score e Type:");
	      movies.stream()
			.filter(movie -> movie.getScore() >= 9 && movie.getType().startsWith("Sci-fi") )
			.forEach(System.out::println);
	      
	      System.out.println("[6]=====================");
	      
	      System.out.println("Lista original Usuarios:");
	    
	      List<Usuario> usuarios = DataSource.getUsuarios();	        
	        
	  		usuarios.forEach(System.out::println); 
	  		
	    System.out.println("[7]=====================");
	      
	      usuarios.removeIf(u -> u.getPontos() <= 200);
			usuarios.forEach(System.out::println);
			
			 System.out.println("[8]=====================");
			 
			 usuarios.stream()
			 .filter(u -> u.getPontos() >300);
			 usuarios.forEach(u -> u.setModerador(true));
			 usuarios.forEach(System.out::println);

	      
			        
	}

}

