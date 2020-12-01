package Model;

import java.util.ArrayList;
import java.util.Date;

import Controller.FileManager;

public class Schedule {
	//Need search function
//	private Theater theater;
//	
//	private Movie movie;
	
	private Date showtime;
	
	private ArrayList<SeatReservation> seatReservation;
	
	

	
	private String movieName;
	private String theaterName;


//	public Schedule(Theater theater,Movie movie,Date showtime) {
//		this.movie = movie;
//		this.theater = theater;
//		this.showtime = showtime;
//	}
	
	public Schedule(String theaterName,String movieName,Date showtime) {
		this.setMovieName(movieName);
		this.setTheaterName(theaterName);
		this.showtime = showtime;
	}
	
	
	public Schedule() {
		// TODO Auto-generated constructor stub
	}
	
//	public Theater getTheater() {
//		return theater;
//	}
//
//	public void setTheater(Theater theater) {
//		this.theater = theater;
//	}
//
//	public Movie getMovie() {
//		return movie;
//	}
//
//	public void setMovie(Movie movie) {
//		this.movie = movie;
//	}

	public ArrayList<SeatReservation> getSeatReservation() {
		return seatReservation;
	}

	public void setSeatReservation(ArrayList<SeatReservation> seatReservation) {
		this.seatReservation = seatReservation;
	}

	public Date getShowtime() {
		return showtime;
	}

	public void setShowtime(Date showtime) {
		this.showtime = showtime;
	}


	public String getMovieName() {
		return movieName;
	}


	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}


	public String getTheaterName() {
		return theaterName;
	}


	public void setTheaterName(String theaterName) {
		this.theaterName = theaterName;
	}
	
	
	
	
	
		

	
}
