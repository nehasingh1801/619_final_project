package Model;

import java.util.Date;

public class Ticket {
	
	private Seat seat;
	private Theater theater;
	private Schedule schedule;
	private double price;
	private boolean ticketStatus;
	
	public Ticket() {
		
	}
	
	public Seat getSeat() {
		return seat;
	}
	public void setSeat(Seat seat) {
		this.seat = seat;
	}
	public Theater getTheater() {
		return theater;
	}
	public void setTheater(Theater theater) {
		this.theater = theater;
	}
	public Schedule getSchedule() {
		return schedule;
	}
	public void setSchedule(Schedule showtime) {
		this.schedule = showtime;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public boolean isTicketStatus() {
		return ticketStatus;
	}
	public void setTicketStatus(boolean ticketStatus) {
		this.ticketStatus = ticketStatus;
	}
	

	public int getSeatNum() {
		return getSeat().getSeatNumber();
				
	}
	
	public String getTheaterLocation() {
		
		return getTheater().getTheaterAddress();
	}
	
	
	public long getShowtime() {
		return getSchedule().getShowtime().getTime();
	}
	
	public void cancelTicket() {
		
		
	}
	
	@Override
	public String toString() {
		String temp = "";
		
		temp = temp + "Movie: " + schedule.getMovieName()+ "\n" 
				+ "Show Date: " + schedule.getShowtime().getDate() + "\n"
				+ "Show Time: " + schedule.getShowtime().getTime() + "\n"
				+ "Theater name: " + schedule.getTheaterName() + "\n"
				+ "Theater address: " + "\n";
		return null;
	}

}
