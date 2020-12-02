package Controller;
import java.util.ArrayList;
import java.util.Date;

import Model.*;
import View.*;

public class TicketReservationSystem {

	private TheaterList theaterList = new TheaterList();
	private MovieList movieList = new MovieList();
	private RegisteredUserList userList = new RegisteredUserList();
	private OfferingList scheduleList = new OfferingList(movieList, theaterList);
	private VoucherList voucherList = new VoucherList();
	private LoginGUI login = new LoginGUI();
	private SearchGUI search = new SearchGUI();
	private SeatMapGUI seats = new SeatMapGUI();
	private TransactionGUI trans = new TransactionGUI();
	private UserInfoGUI user = new UserInfoGUI();
	private MemberPortal meberPortalView = new MemberPortal();
	
	private ManagePurchase managePurchase;
	private ManageUser manageUser;
	private SearchEngine searchEngine;
	private ManageCancellation cancellationController;
	
//	private Schedule schedule;
	
	//private DatabaseCommunicator comm;
	
	public TicketReservationSystem(String movieFileName, String theaterFileName, String scheduleFileName, String regUserFileName, String voucherFileName) {
		//Database connection here
		theaterList.loadTheaterRepo(theaterFileName);
		movieList.loadMovieRepo(movieFileName);
		userList.loadRegisteredUserRepo(regUserFileName);
		scheduleList.loadOfferings(scheduleFileName);
		voucherList.loadVoucherRepo(voucherFileName);
		managePurchase = new ManagePurchase(trans, voucherList);
		manageUser = new ManageUser(login, user, meberPortalView, search, userList, managePurchase);
		searchEngine = new SearchEngine(seats, search, trans, scheduleList);
		cancellationController = new ManageCancellation(search, managePurchase, userList);
	}
	
	public void run() {
		login.displayGUI();
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
		String voucherFileName = "vouchers.txt";
		
		TicketReservationSystem system = new TicketReservationSystem(movieFileName
				, theaterFileName, scheduleFileName, filename, voucherFileName);
		system.run();
	/**
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
		
		VoucherList voucherList = new VoucherList();
		voucherList.loadVoucherRepo(filename);
		
		

		LoginGUI login = new LoginGUI();
		SearchGUI search = new SearchGUI();
		SeatMapGUI seats = new SeatMapGUI();
		TransactionGUI trans = new TransactionGUI();
		UserInfoGUI user = new UserInfoGUI();
		MemberPortal meberPortalView = new MemberPortal();
		
		ManagePurchase managePurchase = new ManagePurchase(trans, voucherList);
		ManageUser manageUser = new ManageUser(login, user, meberPortalView, search, regUSerList, managePurchase);
		SearchEngine searchEngine = new SearchEngine(seats, search, trans, offeringList);
		ManageCancellation cancellationController = new ManageCancellation(search, managePurchase, regUSerList);

		login.displayGUI();
	**/
	}

}



