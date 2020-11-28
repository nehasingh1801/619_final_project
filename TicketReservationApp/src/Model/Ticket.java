package Model;

public class Ticket {
	
	private Seat seatNum;
	private Theater theaterLoc;
	private Schedule showtime;
	private double price;
	private boolean ticketStatus;
	public Seat getSeatNum() {
		return seatNum;
	}
	public void setSeatNum(Seat seatNum) {
		this.seatNum = seatNum;
	}
	public Theater getTheaterLoc() {
		return theaterLoc;
	}
	public void setTheaterLoc(Theater theaterLoc) {
		this.theaterLoc = theaterLoc;
	}
	public Schedule getShowtime() {
		return showtime;
	}
	public void setShowtime(Schedule showtime) {
		this.showtime = showtime;
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

}
