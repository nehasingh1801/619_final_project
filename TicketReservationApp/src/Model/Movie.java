package Model;

//import com.mysql.cj.x.protobuf.MysqlxDatatypes.Scalar.String;

public class Movie {
	
	private String movieName;
	private String movieDirector;
	
	public Movie(String movieDirector, String movieName) {
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
	
	@Override
	public String toString() {

		return movieName + ", Directro name: " + movieDirector ;

	}

}
