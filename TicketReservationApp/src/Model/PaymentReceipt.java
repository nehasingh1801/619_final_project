package Model;

import java.util.Date;
import java.util.Random;

public class PaymentReceipt {
	//Needs a registered user as foreign key (null)
	private int receiptId;
	
	private Ticket ticket;
	
	private String creditCard;
	
	private Date receiptDate;
	
	public PaymentReceipt() {
		this.receiptId = 10000 + new Random().nextInt(90000);
		this.receiptDate = new Date();
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

	
	public void validateReceiptId() {
		
		//validate receiptDate
		
	}
}
