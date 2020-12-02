package Model;

import java.util.ArrayList;
import java.util.Date;

import Controller.FileManager;

public class OfferingList {

	private MovieList movieList;
	private TheaterList theaterList;
	// private Schedule schedule;

	private ArrayList<Schedule> scheduleList;

	public OfferingList(MovieList movieList, TheaterList theaterList) {
		this.setMovieList(movieList);
		this.setTheaterList(theaterList);

	}

	// loads the schedule.txt file
	public void loadOfferings(String filename) {

		FileManager fm = new FileManager(filename);
		setScheduleList(fm.readScheduleFile(movieList, theaterList)); // shallow copy

	}

	public MovieList getMovieList() {
		return movieList;
	}

	public void setMovieList(MovieList movieList) {
		this.movieList = movieList;
	}

	public TheaterList getTheaterList() {
		return theaterList;
	}

	public void setTheaterList(TheaterList theaterList) {
		this.theaterList = theaterList;
	}

	public ArrayList<Schedule> getScheduleList() {
		return scheduleList;
	}

	public void setScheduleList(ArrayList<Schedule> scheduleList) {
		this.scheduleList = scheduleList;
	}


	public String[] listTheaterNames() {
		String[] theaterNames = new String[theaterList.getTheaterList().size()];
		for (int i = 0; i<theaterNames.length; i++) {
			theaterNames[i] = theaterList.getTheaterList().get(i).getTheaterName();
		}

		return theaterNames;
	}
	
	public void addSchedule(Schedule s) {
		scheduleList.add(s);
	}

	public ArrayList<Schedule> searchMovieList(String theaterName) {
		ArrayList<Schedule> schedule = new ArrayList<Schedule>();

		for (Schedule s : scheduleList) {

			if (s.getTheaterName().equalsIgnoreCase(theaterName)) {
				
//				System.out.println(schedule.contains(s));
				
				if(!schedule.contains(s)) {
					System.out.println("not present");
					schedule.add(s);
					
				}else {
					
				}
				
				
				
//				if(!schedule.contains(s.getMovieName())) {
//					
//					System.out.println("movie not present");
////					continue;
//				}
				
				
				
			}

		}

		return schedule;

	}
	
	public String[] listMovieNames(String name) {
		String[] movieNames = new String[searchMovieList(name).size()];
		for(int i = 0; i < movieNames.length; i++) {
			movieNames[i] = searchMovieList(name).get(i).getMovieName();
		}
		
		
		
		return movieNames;
	}

	public ArrayList<Schedule> searchSchedule(String movieName, String theaterName) {

		ArrayList<Schedule> schedule = new ArrayList<Schedule>();

		if (scheduleList.isEmpty()) {
			System.out.println("scheduleList is empty");
		}

		for (Schedule s : scheduleList) {


			if (s.getMovieName().equalsIgnoreCase(movieName) && s.getTheaterName().equalsIgnoreCase(theaterName)) {



				schedule.add(s);
			}

		}

		return schedule;

	}
	
	public Schedule searchSchedule(String movieName, String theaterName, String date) {
		ArrayList<Schedule> candidates = searchSchedule(movieName, theaterName);
		for(Schedule s : candidates)
			if(s.getShowtime().toString().contentEquals(date))
				return s;
		return null;
	}
	
	public String[] listSchedule(String movieName, String theaterName) {
		String[] temp = new String[searchSchedule(movieName, theaterName).size()];
		for(int i = 0; i < temp.length; i++) {
			temp[i] = searchSchedule(movieName, theaterName).get(i).getShowtime().toString();
		}
		
		return temp;
	}
}
