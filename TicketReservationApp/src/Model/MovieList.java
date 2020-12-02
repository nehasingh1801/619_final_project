package Model;

import java.util.ArrayList;

import Controller.FileManager;
//Need a method to search movie by name at least
public class MovieList {

	
	private ArrayList<Movie> movieList;

	public MovieList() {
		movieList = new ArrayList<Movie>();
	}
	
	public ArrayList<Movie> getMovie() {
		return movieList;
	}

	public Movie searchMovie(String movieName) {
		for(Movie m : movieList)
			if(m.getMovieName().toLowerCase().contains(movieName.toLowerCase()))
				return m;
		return null;
	}
	
	public void setMovie(ArrayList<Movie> movie) {
		this.movieList = movie;
	}
	
	
	public void loadMovieRepo(String filename) {

		FileManager fm = new FileManager(filename);
		movieList = fm.readMovieFile(); //shallow copy

	}
	
	public void listMovies(){
        for(Movie movie: movieList){
            System.out.println("Movie: " + movie);
        }
    }
	

	
}
