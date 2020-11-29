package Model;

public class Ticket {
	
	private Seat seatNum;
	private Theater theaterLoc;
	private Schedule schedule;
	private double price;
	private boolean ticketStatus;
	
	public Ticket() {
		
	}
	
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
		return schedule;
	}
	public void setShowtime(Schedule showtime) {
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
	
	@Override
	public String toString() {
		String temp = "";
		
		temp = temp + "Movie: " + schedule.getMovie().getMovieName()+ "\n" 
				+ "Show Date: " + schedule.getShowtime().getDate() + "\n"
				+ "Show Time: " + schedule.getShowtime().getTime() + "\n"
				+ "Theater name: " + schedule.getTheater().getTheaterName() + "\n"
				+ "Theater address: " + schedule.getTheater().getTheaterAddress() + "\n";
		return null;
	}

}
