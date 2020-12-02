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
		String voucherFileName = "vouchers.txt";
		String receiptfile = "receipts.txt";
		
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
		
		PaymentReceiptList pymtRcptList = new PaymentReceiptList();
		pymtRcptList.loadReceiptRepo(receiptfile);
		
		

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
		
		
		
	}

}



