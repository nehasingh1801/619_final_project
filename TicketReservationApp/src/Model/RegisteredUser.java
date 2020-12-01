package Model;

import java.util.Date;

public class RegisteredUser {
	
	private String name;
	
	private String address;
	
	private String username;
	
	private String password;
	
	private long creditcardNumber;
	
	private Date registrationStartDate;
	//User does not need a foreign key refund
	private RefundConfirmation refund;

	private double userFee;

	public RegisteredUser(String name, String username, String password, String address, long cardNum, Date registrationStartDate) {
		setName(name);
		setUsername(username);
		setPassword(password);
		setAddress(address);
		setCreditcardNumber(cardNum);
		this.registrationStartDate = registrationStartDate;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public long getCreditcardNumber() {
		return creditcardNumber;
	}

	public void setCreditcardNumber(long creditcardNumber) {
		this.creditcardNumber = creditcardNumber;
	}

	public Date getRegistrationStartDate() {
		return registrationStartDate;
	}

	public void setRegistrationStartDate(Date registrationStartDate) {
		this.registrationStartDate = registrationStartDate;
	}

	public RefundConfirmation getRefund() {
		return refund;
	}

	public void setRefund(RefundConfirmation refund) {
		this.refund = refund;
	}

	public double getUserFee() {
		return userFee;
	}

	public void setUserFee(double userFee) {
		this.userFee = userFee;
	}
	

}
