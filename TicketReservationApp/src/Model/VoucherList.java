package Model;

import java.util.ArrayList;

import Controller.FileManager;

public class VoucherList {

	private ArrayList<Voucher> voucherList;
	
	public VoucherList() {
		voucherList = new ArrayList<Voucher>();
	}

	public ArrayList<Voucher> getVoucherList() {
		return voucherList;
	}

	public void setVoucherList(ArrayList<Voucher> voucherList) {
		this.voucherList = voucherList;
	}
	
	public void loadVoucherRepo(String filename) {

		FileManager fm = new FileManager(filename);
		voucherList = fm.readVoucherFile(); 

	}
	
	
	public boolean validateVoucher(String voucherId) {
		
		for(Voucher v : voucherList) {
			
			if(v.getVoucherId().equals(voucherId)) {
				return true;
			}
		}
		
		
		return false;
		
	}
	
	
}
