package Model;

import java.util.ArrayList;

import Controller.FileManager;

public class TheaterList {
	
	private ArrayList<Theater> theaterList;

	public ArrayList<Theater> getTheaterList() {
		return theaterList;
	}

	public void setTheaterList(ArrayList<Theater> theaterList) {
		this.theaterList = theaterList;
	}
	
	public Theater searchTheater(String theaterName) {
		for(Theater t : theaterList) {
			if(t.getTheaterName().toLowerCase().contains(theaterName.toLowerCase()))
				return t;
		}
		return null;
	}


	public void loadTheaterRepo(String filename) {

		FileManager fm = new FileManager(filename);
		theaterList = fm.readTheaterFile(); //shallow copy

	}
	
	public void listTheaters(){
        for(Theater t: theaterList){
            System.out.println("Theater: " + t);
        }
    }

    public String[] listTheaterNames() {
		String[] theaterNames = new String[theaterList.size()];
		for (int i = 0; i<theaterNames.length; i++) {
			theaterNames[i] = theaterList.get(i).getTheaterName();
		}

		return theaterNames;
	}
}
