package Model;

import java.util.ArrayList;
//Need a method to search movie by name at least
public class MovieList {

	
	private ArrayList<Movie> movie;

	public ArrayList<Movie> getMovie() {
		return movie;
	}

	public Movie searchMovie(String movieName) {
		for(Movie m : movie)
			if(m.getMovieDirector().toLowerCase().contains(movieName.toLowerCase()))
				return m;
		return null;
	}
	
	public void setMovie(ArrayList<Movie> movie) {
		this.movie = movie;
	}
}
