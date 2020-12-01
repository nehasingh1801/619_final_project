package Model;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

import Controller.FileManager;
//Need methods to search user for administration
public class RegisteredUserList {

	private  ArrayList<RegisteredUser> regUserList ;

	public ArrayList<RegisteredUser> getRegUserList() {
		return regUserList;
	}

	public void setRegUserList(ArrayList<RegisteredUser> regUserList) {
		this.regUserList = regUserList;
	}
	
	public void loadRegisteredUserRepo(String filename) {

		FileManager fm = new FileManager(filename);
		regUserList = fm.readRegisteredUserFile(); //shallow copy

	}
	
	public boolean validateLogin(String username, String password) {
		
		for(RegisteredUser user : regUserList) {
			if(user.getUsername().equals(username) && user.getPassword().equals(password)) {
				return true;
			}
		}
		
		return false;
		
	}
	
	
	public boolean checkSubscriptionStatus(String username) {
		
		
		Calendar cal = Calendar.getInstance();
        Date today = cal.getTime();
        System.out.println("current system date: "+today);
//		Date todatDate = new Date();
		for(RegisteredUser user : regUserList) {
			
			if(user.getUsername().equals(username)) {
				
				
				Date subsStartDate = user.getRegistrationStartDate();
				System.out.println("subscription start date of user: " + subsStartDate);
				cal.setTime(subsStartDate);
				cal.add(Calendar.YEAR, 1);
				Date subsEndDate = cal.getTime();
				System.out.println("subscription end date of user: " + subsEndDate);

				
				if(today.after(subsEndDate)) {
					//subscription over
					return false;
				}
			}
		}
		
		return true;
		
	}
}
