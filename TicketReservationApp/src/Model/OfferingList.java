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
		setScheduleList(fm.readScheduleFile()); // shallow copy

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

	// added by Neha
	// public ArrayList<Date> getSchedule(String movieName, String theaterName) {
	//
	// ArrayList<Date> showtimes = null;
	//
	//// Movie m = movieList.searchMovie(movieName);
	// for (Movie m : movieList.getMovie()) {
	//
	// for (Theater t : theaterList.getTheaterList()) {
	// if (m.getMovieName().equalsIgnoreCase(movieName) &&
	// t.getTheaterName().equalsIgnoreCase(theaterName)) {
	//
	// showtimes.add(schedule.getShowtime());
	//
	// }
	// }
	//
	// }
	//
	// return showtimes;
	//
	// }
	

	public ArrayList<Schedule> searchMovieList(String theaterName) {
		ArrayList<Schedule> schedule = new ArrayList<Schedule>();

		for (Schedule s : scheduleList) {

			if (s.getTheaterName().equalsIgnoreCase(theaterName)) {
				schedule.add(s);
			}

		}

		return schedule;

	}

	public ArrayList<Schedule> searchSchedule(String movieName, String theaterName) {

		ArrayList<Schedule> schedule = new ArrayList<Schedule>();

		if (scheduleList.isEmpty()) {
			System.out.println("scheduleList is empty");
		}

		for (Schedule s : scheduleList) {
			//
			// System.out.println(s.getMovieName());
			// System.out.println( s.getTheaterName());

			if (s.getMovieName().equalsIgnoreCase(movieName) && s.getTheaterName().equalsIgnoreCase(theaterName)) {

				// System.out.println("inside if loop");
				// System.out.println(s);

				schedule.add(s);
				// return s;
			}
			// else {
			// continue;
			// }
		}

		return schedule;

	}
}
