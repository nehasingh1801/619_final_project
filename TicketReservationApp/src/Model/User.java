package Model;

public class User {
	
	private Ticket movieTicket;
	//Neither ticket nor voucher is particular to an user
	//Ticket is referenced by payment instead, and payment references registered user optionally
	private Voucher refundVoucher;
	
	
	public Ticket getMovieTicket() {
		return movieTicket;
	}
	
	public void setMovieTicket(Ticket movieTicket) {
		this.movieTicket = movieTicket;
	}
	
	public Voucher getRefundVoucher() {
		return refundVoucher;
	}
	
	public void setRefundVoucher(Voucher refundVoucher) {
		this.refundVoucher = refundVoucher;
	}

}
