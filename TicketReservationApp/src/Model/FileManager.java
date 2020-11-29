package Model;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


public class FileManager {
	
	private String filename;
	
	private Movie movie;
	
	private Theater theater;

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public FileManager(String filename, Movie movie, Theater theater) {
		this.filename = filename;
		this.setMovie(movie);
		this.setTheater(theater);
	}
	
	
	public ArrayList<Movie> readMovieFile() {
		ArrayList<Movie> movieList = new ArrayList<Movie>();
		

		try {
			File myObj = new File(filename);
			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				String[] splitData = data.split(";",5);
				Movie i = new Movie(splitData[1],splitData[0]);
				movieList.add(i);
				

			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		return movieList;
	}
	
	public ArrayList<Theater> readTheaterFile() {
		ArrayList<Theater> theaterList = new ArrayList<Theater>();
		

		try {
			File myObj = new File(filename);
			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				String[] splitData = data.split(";",5);
				Theater t = new Theater(splitData[0], splitData[1]);
				theaterList.add(t);
				

			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		return theaterList;
	}
	
//	public ArrayList<Schedule> readScheduleFile() {
//		ArrayList<Schedule> schedule = new ArrayList<Schedule>();
//		
//
//		try {
//			File myObj = new File(filename);
//			Scanner myReader = new Scanner(myObj);
//			SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss");  
//			while (myReader.hasNextLine()) {
//				String data = myReader.nextLine();
//				String[] splitData = data.split(";",5);
//				Schedule s = new Schedule();
//				schedule.add(s);
//				
//
//			}
//			myReader.close();
//		} catch (FileNotFoundException e) {
//			System.out.println("An error occurred.");
//			e.printStackTrace();
//		}
//		return schedule;
//	}

	public Theater getTheater() {
		return theater;
	}

	public void setTheater(Theater theater) {
		this.theater = theater;
	}

	public Movie getMovie() {
		return movie;
	}

	public void setMovie(Movie movie) {
		this.movie = movie;
	}
	
}
