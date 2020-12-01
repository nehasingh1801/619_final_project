package Model;

import java.util.ArrayList;
import java.util.Date;

import Controller.FileManager;

public class Schedule {
	//Need search function
	private Theater theater;
	
	private Movie movie;
	
	private Date showtime;
	
	private ArrayList<SeatReservation> seatReservation;
	
	private ArrayList<Schedule> schedule;
	
	private MovieList movieList;
	private TheaterList theaterList;

	public Schedule(Theater theater,Movie movie,Date showtime) {
		this.movie = movie;
		this.theater = theater;
		this.showtime = showtime;
	}
	
	public Schedule() {
		// TODO Auto-generated constructor stub
	}
	
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

	public Date getShowtime() {
		return showtime;
	}

	public void setShowtime(Date showtime) {
		this.showtime = showtime;
	}
	
	public void loadSchedules(String filename) {

		FileManager fm = new FileManager(filename);
		schedule = fm.readScheduleFile(); //shallow copy

	}
	
	
	//added by Neha
		public ArrayList<Date> getSchedule(String movieName,  String theaterName) {
			
			ArrayList<Date> showtimes = null;
			
//			Movie m = movieList.searchMovie(movieName);
			for(Movie m : movieList.getMovie()) {
				
				for(Theater t: theaterList.getTheaterList()) {
					if(m.getMovieName().equalsIgnoreCase(movieName)  && t.getTheaterName().equalsIgnoreCase(theaterName)) {
						showtimes.add(showtime);
						
						
					}
				}
				
				
			}
			
			return showtimes;
			
			
			
		



	}
		

	
}
