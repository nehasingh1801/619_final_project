package Model;

import java.util.ArrayList;

public class Theater {

	private String theaterName;
	private String theaterAddress;
	
	private ArrayList<Seat> seats;
	//Theater has many schedules
	private Schedule schedule;
	
	public Theater(String theaterName, String theaterAddress) {
		this.setTheaterName(theaterName);
		this.setTheaterAddress(theaterAddress);
		
	}

	public String getTheaterName() {
		return theaterName;
	}

	public void setTheaterName(String theaterName) {
		this.theaterName = theaterName;
	}

	public String getTheaterAddress() {
		return theaterAddress;
	}

	public void setTheaterAddress(String theaterAddress) {
		this.theaterAddress = theaterAddress;
	}

	public ArrayList<Seat> getSeats() {
		return seats;
	}

	public void setSeats(ArrayList<Seat> seats) {
		this.seats = seats;
	}

	public Schedule getSchedule() {
		return schedule;
	}

	public void setSchedule(Schedule schedule) {
		this.schedule = schedule;
	}
	
}
