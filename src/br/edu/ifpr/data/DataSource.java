package br.edu.ifpr.data;

import java.util.ArrayList;
import java.util.List;

import br.edu.ifpr.model.Candidato;
import br.edu.ifpr.model.Movie;
import br.edu.ifpr.model.Usuario;

public class DataSource {

	public static List<Usuario> getUsuarios() {
		List<Usuario> usuarios = new ArrayList<>();
		usuarios.add(new Usuario("Roberto", 350));
		usuarios.add(new Usuario("Hugo", 200));
		usuarios.add(new Usuario("Kate", 120));
		usuarios.add(new Usuario("Beatriz", 320));		
		return usuarios;
	}
	public static List<Movie> getMovies() {
		List<Movie> movies = new ArrayList<Movie>();
		movies.add(new Movie("Avatar", 7, 2009, "Action"));
		movies.add(new Movie("Matrix", 9, 1999, "Sci-fi"));
		movies.add(new Movie("Terminator", 8, 1984, "Sci-fi"));
		movies.add(new Movie("Rock", 6, 1976, "Action"));
		movies.add(new Movie("Titanic", 4, 1997, "Drama"));
		movies.add(new Movie("Alien", 10, 1979, "Sci-fi" ));
		return movies;
	}
	
	public static List<Candidato> getCandidatos(){	
		List<Candidato> candidatos = new ArrayList<>();
		candidatos.add(new Candidato("C", 2010, 1280.50f));
		candidatos.add(new Candidato("B",2004, 1350.00f ));
		candidatos.add(new Candidato("A", 2001, 1145.00f));
		candidatos.add(new Candidato("B", 1999, 980.78f));
		candidatos.add(new Candidato("A", 1999, 1430.25f));
		return candidatos;
}

}
