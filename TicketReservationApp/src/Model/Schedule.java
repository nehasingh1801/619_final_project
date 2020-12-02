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
	private Movie movieName;
	private Theater theaterName;

	private int scheduleId ;

//	public Schedule(Theater theater,Movie movie,Date showtime) {
//		this.movie = movie;
//		this.theater = theater;
//		this.showtime = showtime;
//	}
	
	public Schedule(Theater theaterName,Movie movieName,Date showtime) {
		this.setMovieName(movieName);
		theaterName.addSchedule(this);
		this.setTheaterName(theaterName);
		this.showtime = showtime;
		seatReservation = new ArrayList<SeatReservation>();
		for(Seat s : theaterName.getSeats())
			seatReservation.add(new SeatReservation(s));
	}
	
	private int registeredCount() {
		int i = 0;
		for(SeatReservation s : seatReservation)
			if(s.getBookingStatus().toLowerCase().contentEquals("registered")) i++;
		return i;
	}
	
	public double registeredRate() {
		return (double)this.registeredCount()/seatReservation.size();
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
	
	public boolean isVacant(int i) {
		SeatReservation seat = this.searchSeat(i);
		if(seat == null) return false;
		return seat.isVacant();
	}

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
		return movieName.getMovieName();
	}

	public SeatReservation searchSeat(int i) {
		for(SeatReservation s : seatReservation)
			if(s.getSeatNumber()==i) return s;
		return null;
	}

	public void setMovieName(Movie movieName) {
		this.movieName = movieName;
	}


	public String getTheaterName() {
		return theaterName.getTheaterName();
	}
	
	public void vacantASeat(int num) {
		SeatReservation seat = this.searchSeat(num);
		seat.setBookingStatus("vacant");
	}
	
	public void bookASeat(int num) {
		SeatReservation seat = this.searchSeat(num);
		seat.setBookingStatus("booked");
	}
	
	public void registerASeat(int num) {
		SeatReservation seat = this.searchSeat(num);
		seat.setBookingStatus("registered");
	}


	public void setTheaterName(Theater theaterName) {
		this.theaterName = theaterName;
	}
	
	
	
	
	
		

	
}
