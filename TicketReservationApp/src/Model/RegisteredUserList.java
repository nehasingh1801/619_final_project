package Model;

import java.util.ArrayList;

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
}
