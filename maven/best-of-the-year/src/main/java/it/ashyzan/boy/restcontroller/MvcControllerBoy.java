package it.ashyzan.boy.restcontroller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import it.ashyzan.boy.model.Movie;
@Controller
public class MvcControllerBoy {
	
	@GetMapping ("/best")
	public String best(@RequestParam(name = "nome", required = false) 
	String nome, Model model) {
		
		model.addAttribute("name", nome);
		
		return "best";
		
	}
	
	
	
	@GetMapping ("/movies")
	public String getBestMovies(Model model){
		Movie filmUno = new Movie();
		Movie filmDue = new Movie();
		Movie filmTre = new Movie();
		
		filmUno.setTitleMovie("Il quinto elemento");
		filmUno.setAuthorMovie("Luc Besson");
		filmUno.setIdMovie(0);
		filmDue.setTitleMovie("Via col vento");
		filmDue.setAuthorMovie("Victor Fleming");
		filmDue.setIdMovie(1);
		filmTre.setTitleMovie("Matrix");
		filmTre.setAuthorMovie("Fratelli Wachoski");
		filmTre.setIdMovie(2);
		
		model.addAttribute("movie", filmUno);
		
		
		return "bestmovies";
		
	}
	
	private List<Movie> getBestMovies() {
		List<Movie> bestmoviesList = new ArrayList<>();
		
		return bestmoviesList;
	}


}
