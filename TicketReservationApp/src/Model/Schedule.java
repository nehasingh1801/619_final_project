package Model;

import java.util.ArrayList;
import java.util.Date;

public class Schedule {
	//Need search function
	private Theater theater;
	
	private Movie movie;
	
	private Date showtime;
	
	private ArrayList<SeatReservation> seatReservation;

	public Theater getTheater() {
		return theater;
	}

	public void setTheater(Theater theater) {
		this.theater = theater;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}

	public ArrayList<SeatReservation> getSeatReservation() {
		return seatReservation;
	}

	public void setSeatReservation(ArrayList<SeatReservation> seatReservation) {
		this.seatReservation = seatReservation;
	}

}
