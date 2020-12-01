package Controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import Model.Movie;
import Model.Schedule;
import Model.Theater;


public class FileManager {
	
	private String filename;
	
//	private Movie movie;
	
//	private Theater theater;

	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}

	public FileManager(String filename) {
		this.filename = filename;

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
	
	public ArrayList<Schedule> readScheduleFile() {
		ArrayList<Schedule> schedule = new ArrayList<Schedule>();
		

		try {
			File myObj = new File(filename);
			Scanner myReader = new Scanner(myObj);
			SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss");  
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				String[] splitData = data.split(";",5);
				Schedule s;
				try {
					s = new Schedule(new Theater(splitData[0], ""), new Movie(splitData[1],""), sdf.parse(splitData[2]));
					schedule.add(s);
				} catch (ParseException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				

			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		return schedule;
	}

	
}