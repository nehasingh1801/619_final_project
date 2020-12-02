package Model;

public class SeatReservation {
	
	private Seat seat;
	
	
	
	private String bookingStatus;
	//Can be: vacant, booked, registered
	public Seat getSeat() {
		return seat;
	}

	public void setSeat(Seat seat) {
		this.seat = seat;
	}

	public String getBookingStatus() {
		return bookingStatus;
	}

	public void setBookingStatus(String bookingStatus) {
		this.bookingStatus = bookingStatus;
	}
	
	public SeatReservation(Seat seat) {
		this.seat = seat;
		bookingStatus = "vacant";
	}
	
	public boolean isVacant() {
		return bookingStatus.toLowerCase().contentEquals("vacant");
	}
	
	public int getSeatNumber() {
		return seat.getSeatNumber();
	}

}
