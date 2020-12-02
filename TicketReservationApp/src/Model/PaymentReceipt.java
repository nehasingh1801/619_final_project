package Model;

import java.util.Calendar;
import java.util.Date;
import java.util.Random;

public class PaymentReceipt {
	//Needs a registered user as foreign key (null)
	private int receiptId;
	
	private Ticket ticket;
	
	private String creditCard;
	
	private Date receiptDate;
	
	private Date showtime;
	
	
	public PaymentReceipt(int receiptId, Date showtime) {
//		this.receiptId = 10000 + new Random().nextInt(90000);
		this.receiptDate = new Date();
		this.receiptId = receiptId;
		this.showtime = showtime;
		
	}

	public int getReceiptId() {
		return receiptId;
	}

	public void setReceiptId(int receiptId) {
		this.receiptId = receiptId;
	}

	public Ticket getTicket() {
		return ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

	public String getCreditCard() {
		return creditCard;
	}

	public void setCreditCard(String creditCard) {
		this.creditCard = creditCard;
	}

	public Date getReceiptDate() {
		return receiptDate;
	}

	public void setReceiptDate(Date receiptDate) {
		this.receiptDate = receiptDate;
	}

	public Date getShowtime() {
		return showtime;
	}

	public void setShowtime(Date showtime) {
		this.showtime = showtime;
	}

	
	//cancellation cal
			public String userValidateReceipt(Date sysdate) {
				
				double adminFee = 1.50;
				double voucherAmount = 0;
				
				double ticketPrice = 10;
				Calendar cal = Calendar.getInstance(); // creates calendar
				cal.setTime(getShowtime());               // sets calendar time/date
				cal.add(Calendar.HOUR_OF_DAY, -72);      // adds one hour
				
				String temp = "";
				
				
				
				Date hours72beforeshowtime = cal.getTime();
				
				
				if(sysdate.before(hours72beforeshowtime)) {
					
					 voucherAmount = ticketPrice - adminFee;
					
					 temp =  "Cancellation successful, Voucher sent for " + voucherAmount;
				}
				else {
					temp =  "Cancellation successful, no voucher issued. " ;
				}
				
				
				
				return temp;
				
			}
			
public String regUserValidateReceipt(Date sysdate) {
				
				double adminFee = 1.50;
				double voucherAmount = 0;
				
				double ticketPrice = 10;
				Calendar cal = Calendar.getInstance(); // creates calendar
				cal.setTime(getShowtime());               // sets calendar time/date
				cal.add(Calendar.HOUR_OF_DAY, -72);      // adds one hour
				
				String temp = "";
				
				
				
				Date hours72beforeshowtime = cal.getTime();
				
				
				if(sysdate.before(hours72beforeshowtime)) {
					
					 voucherAmount = ticketPrice - adminFee;
					
					 temp =  "Cancellation successful, full amount refunded" ;
				}
				else {
					temp =  "Cancellation successful, no refund issued. " ;
				}
				
				
				
				return temp;
				
			}
	
	
}
