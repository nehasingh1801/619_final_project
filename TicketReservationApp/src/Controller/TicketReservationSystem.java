package Controller;
import java.util.Date;

import Model.*;
public class TicketReservationSystem {

	private TheaterList theaterList;
	private MovieList movieList;
	private RegisteredUserList userList;
	//private DatabaseCommunicator comm;
	
	public TicketReservationSystem() {
		//Database connection here
	}
	
	public Seat searchSeat(int seatNum, String theaterName) {
		Theater theater = theaterList.searchTheater(theaterName);
		if(theater == null) return null;
		return theater.searchSeat(seatNum);
	}
	
	public void addSchedule(String theaterName, String movieName, Date showTime) {
		Theater theater = theaterList.searchTheater(theaterName);
		if(theater == null) return;
		Movie movie= movieList.searchMovie(movieName);
		if(movie == null) return;
		theater.addSchedule(movie, showTime);
	}
}
