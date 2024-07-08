package it.ashyzan.boy.restcontroller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import it.ashyzan.boy.model.Movie;

@Controller
public class MvcControllerBoy {

	@GetMapping("/best")
	public String best(@RequestParam(name = "nome", required = false) String nome, Model model) {

		model.addAttribute("name", nome);

		return "best";

	}

	@GetMapping("/moviestest")
	public String getMoviesTest(Model model) {
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

		List<Movie> bestmoviesList = new ArrayList<>();

		bestmoviesList.add(filmUno);
		bestmoviesList.add(filmDue);
		bestmoviesList.add(filmTre);

		model.addAttribute("movie", filmUno);

		model.addAttribute("movieList", bestmoviesList);

		return "moviestest";

	}

	@GetMapping("/bestmovies")
	public String getBestMovies(Model model) {

		model.addAttribute("movieList", getBestMovies());
		// model.addAttribute("idMovie", getIdMovie());

		return "bestmovies";

	}

	@GetMapping("/movies/{id}")
	public String show(@PathVariable("id") Integer idMovie, Model model) {

		model.addAttribute("idIntero", idMovie);
		model.addAttribute("movieList", getBestMovies());

		return "/movies";
	}

	private List<Movie> getBestMovies() {
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

		List<Movie> bestmoviesList = new ArrayList<>();

		bestmoviesList.add(filmUno);
		bestmoviesList.add(filmDue);
		bestmoviesList.add(filmTre);

		return bestmoviesList;
	}

}
