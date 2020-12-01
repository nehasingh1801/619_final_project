package Controller;
import java.util.ArrayList;
import java.util.Date;

import Model.*;
import View.*;

public class TicketReservationSystem {

	private TheaterList theaterList;
	private MovieList movieList;
	private RegisteredUserList userList;
	private OfferingList scheduleList;
	
	
//	private Schedule schedule;
	
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
		Schedule newSchedule = new Schedule(theater, movie, showTime);
		scheduleList.addSchedule(newSchedule);
	}
	
	
	
	public static void main(String[] args) {

		String movieFileName = "movies.txt";
		String theaterFileName = "theaters.txt";
		String scheduleFileName = "schedule.txt";
		String filename = "registereduserlist.txt";
		
		MovieList movieList = new MovieList();
		//loads movies info into movie List
		movieList.loadMovieRepo(movieFileName);

		TheaterList theaterList = new TheaterList();
		//loads theaters info into theaterlist List
		theaterList.loadTheaterRepo(theaterFileName);

		
		OfferingList offeringList = new OfferingList(movieList, theaterList);
		//loads movies info into movie List
		offeringList.loadOfferings(scheduleFileName);
		
		RegisteredUserList regUSerList = new RegisteredUserList();
		regUSerList.loadRegisteredUserRepo(filename);
		
		
		//print movies.
		movieList.listMovies();
		
		//select movie
		String tempMov = "True Grit";

		
		//print theaters
		theaterList.listTheaters();

		//select theater
		String tempTheater = "PVR";
		
		//select movielist based on theater
		ArrayList<Schedule> movies = offeringList.searchMovieList( tempTheater);
		System.out.println("\nlist of movies \n");
		for(int i=0 ; i<movies.size(); i++) {
			System.out.println(movies.get(i).getMovieName());
		}
		
		
		//select schedule
		ArrayList<Schedule> temp = offeringList.searchSchedule(tempMov, tempTheater);
		
		for(int i=0 ; i<temp.size(); i++) {
			System.out.println(temp.get(i).getShowtime());
		}
//		ArrayList<Date> showtimelist= schedules.getSchedule(tempMov, tempTheater);

		LoginGUI login = new LoginGUI();
		SearchGUI search = new SearchGUI();
		SeatMapGUI seats = new SeatMapGUI();
		TransactionGUI trans = new TransactionGUI();
		UserInfoGUI user = new UserInfoGUI();

		ManagePurchase managePurchase = new ManagePurchase(trans);
		ManageUser manageUser = new ManageUser(login, user, search);
		SearchEngine searchEngine = new SearchEngine(seats, search, trans, offeringList);

		login.displayGUI();
		
		
		
	}

}



