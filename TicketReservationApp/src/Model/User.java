package Model;

public class User {
	
	private Ticket movieTicket;
	
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
