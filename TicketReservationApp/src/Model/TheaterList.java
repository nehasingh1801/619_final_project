package Model;

import java.util.ArrayList;

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

}
