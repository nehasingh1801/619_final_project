package Model;

import java.util.ArrayList;
import java.util.Date;

import Controller.FileManager;

public class PaymentReceiptList {

	private ArrayList<PaymentReceipt> receiptList;

	public ArrayList<PaymentReceipt> getReceiptList() {
		return receiptList;
	}

	public void setReceiptList(ArrayList<PaymentReceipt> receiptList) {
		this.receiptList = receiptList;
	}

	public void loadReceiptRepo(String filename) {

		FileManager fm = new FileManager(filename);
		receiptList = fm.readReceiptFile();

	}

	public String UserSearchReceiptId(int receviptId, Date sysdate) {
		
		System.out.println(receviptId);

		for (PaymentReceipt p : receiptList) {

			if (p.getReceiptId() == receviptId) {

				return p.userValidateReceipt(sysdate);

			}
		}

		return "Receipt Id invalid!!";

	}

	public String registeredUSerSearchRcptID(int receviptId, Date sysdate) {
		
		System.out.println(receviptId);

		for (PaymentReceipt p : receiptList) {

			if (p.getReceiptId() == receviptId) {

				return p.regUserValidateReceipt(sysdate);
//					return "Cancellation successful, amount has been refunded";

			}
		}

		return "Receipt Id invalid!!";

	}

}
