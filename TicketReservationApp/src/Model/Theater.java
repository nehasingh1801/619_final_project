package Model;

import java.util.ArrayList;
import java.util.Date;

public class Theater {

	private String theaterName;
	private String theaterAddress;
	
	private ArrayList<Seat> seats;
	//Theater has many schedules
	private ArrayList<Schedule> schedule;
	
	public Theater(String theaterName, String theaterAddress) {
		this.setTheaterName(theaterName);
		this.setTheaterAddress(theaterAddress);
		schedule = new ArrayList<Schedule>();
	}

	public Seat searchSeat(int seatNum) {
		for(Seat s : seats)
			if(s.getSeatNumber() == seatNum)
				return s;
		return null;
	}
	
	public void addSchedule(Schedule s) {
		schedule.add(s);
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

	public ArrayList<Schedule> getSchedule() {
		return schedule;
	}

	public void setSchedule(ArrayList<Schedule> schedule) {
		this.schedule = schedule;
	}
	
//	public void addSchedule(Movie movie, Date showTime) {
//		schedule.add(new Schedule(this, movie, showTime));
//	}
//	
	@Override
	public String toString() {

		return theaterName + ", Address: " + theaterAddress ;

	}
	
}
