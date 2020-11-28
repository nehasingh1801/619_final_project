package Model;

import java.util.Date;
//Refund needs a payment receipt as foreign key (not null)
public class RefundConfirmation {
	
	private Date refundDate;
	
	private PaymentReceipt refundAmount;
	
	private boolean ifRefunded;

	public Date getRefundDate() {
		return refundDate;
	}

	public void setRefundDate(Date refundDate) {
		this.refundDate = refundDate;
	}

	public PaymentReceipt getRefundAmount() {
		return refundAmount;
	}

	public void setRefundAmount(PaymentReceipt refundAmount) {
		this.refundAmount = refundAmount;
	}

	public boolean isIfRefunded() {
		return ifRefunded;
	}

	public void setIfRefunded(boolean ifRefunded) {
		this.ifRefunded = ifRefunded;
	}

}
