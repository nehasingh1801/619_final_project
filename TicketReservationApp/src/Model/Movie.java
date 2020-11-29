package Model;

//import com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.String;

public class Movie {
	
	private String movieName;
	private String movieDirector;
	
	public Movie(String movieName, String movieDirector) {
		this.setMovieDirector(movieDirector);
		this.setMovieName(movieName);
	}
	
	
	public String getMovieName() {
		return movieName;
	}
	
	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}
	
	public String getMovieDirector() {
		return movieDirector;
	}
	
	public void setMovieDirector(String movieDirector) {
		this.movieDirector = movieDirector;
	}
	
	public void printMovie() {
		//code here
	}

}
