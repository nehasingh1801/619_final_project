package Model;

import java.util.Date;
import java.util.Random;

public class Voucher {
	//Where is the voucher from? Payment foreign key needed (not null)
	private double value;
	private Date startDate;
	private Date expiryDate;
	private String voucherId;
	
	public Voucher (String voucherId, Date startDate, Date expiryDate, double value) {
		
//		this.voucherId = "Voucher" + 100 + new Random().nextInt(900);
		this.voucherId = voucherId;
		this.startDate = startDate;
		this.expiryDate = expiryDate;
		this.value = value;
		
	}
	
	
	public double getValue() {
		return value;
	}
	public void setValue(double value) {
		this.value = value;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getExpiryDate() {
		return expiryDate;
	}
	public void setExpiryDate(Date expiryDate) {
		this.expiryDate = expiryDate;
	}


	public String getVoucherId() {
		return voucherId;
	}


	public void setVoucherId(String voucherId) {
		this.voucherId = voucherId;
	}

}
