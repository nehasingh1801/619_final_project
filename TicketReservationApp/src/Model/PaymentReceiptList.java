package Model;

import java.util.ArrayList;

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
	

}
