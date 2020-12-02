package Controller;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

import Model.*;



public class FileManager {
	
	private String filename;

	
//	private Movie movie;
	
//	private Theater theater;
	
	ArrayList<RegisteredUser> reguser; 
	

	public FileManager(String filename) {
		this.filename = filename;
		this.reguser = new ArrayList<RegisteredUser>();

	}


	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}



	public ArrayList<Movie> readMovieFile() {
	ArrayList<Movie> movieList = new ArrayList<Movie>();

		try {
			File myObj = new File(filename);
			Scanner myReader = new Scanner(myObj);
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				String[] splitData = data.split(";",2);
				Movie i = new Movie(splitData[0],splitData[1]);
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
				String[] splitData = data.split(";",2);
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

	
	public ArrayList<Voucher> readVoucherFile() {
		ArrayList<Voucher> voucherList = new ArrayList<Voucher>();

			try {
				File myObj = new File(filename);
				Scanner myReader = new Scanner(myObj);
				SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss");
				while (myReader.hasNextLine()) {
					String data = myReader.nextLine();
					String[] splitData = data.split(";",4);
					Voucher v;
					try {
						v = new Voucher(splitData[0], sdf.parse(splitData[1]),sdf.parse(splitData[2]), Double.parseDouble(splitData[3]));
						voucherList.add(v);
					} catch (NumberFormatException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
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

			return voucherList;
		}
	
	
	
	public ArrayList<Schedule> readScheduleFile(MovieList movies, TheaterList theaters) {
	ArrayList<Schedule> schedule = new ArrayList<Schedule>();

		try {
			File myObj = new File(filename);
			Scanner myReader = new Scanner(myObj);
			SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss");
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				String[] splitData = data.split(";",3);
				Movie movie = movies.searchMovie(splitData[1]);
				Theater theater = theaters.searchTheater(splitData[0]);
				Schedule s;
				try {
					s = new Schedule(theater, movie, sdf.parse(splitData[2]));
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
	
	
	public ArrayList<RegisteredUser> readRegisteredUserFile() {
//		ArrayList<RegisteredUser> reguser = new ArrayList<RegisteredUser>();
		

		try {
			File myObj = new File(filename);
			Scanner myReader = new Scanner(myObj);
			SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss");  
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				String[] splitData = data.split(";",6);
//				System.out.println(splitData[0]+ " ,  " + splitData[1] + " , " + splitData[2]);
				RegisteredUser s;
				try {
//					s = new Schedule(new Theater(splitData[0], ""), new Movie(splitData[1],""), sdf.parse(splitData[2]));
					s = new RegisteredUser(splitData[0], splitData[1],splitData[2],splitData[3], Long.parseLong(splitData[4]),sdf.parse(splitData[5]));
					reguser.add(s);
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
		return reguser;
	}
	
	@SuppressWarnings("unused")
	public void writeToFile(String text) {
		try {
			 String filename= "registereduserlist.txt";
			 FileWriter fw = new FileWriter(filename,true); //the true will append the new data
			 fw.write("\n"+text);//appends the string to the file
			 fw.close();

			System.out.println("Successfully wrote to the file.");
		} catch(IOException ioe)
		{
		    System.err.println("IOException: " + ioe.getMessage());
		}
	}


	public ArrayList<PaymentReceipt> readReceiptFile() {

		ArrayList<PaymentReceipt> pymtRcpt = new ArrayList<PaymentReceipt>();

		try {
			File myObj = new File(filename);
			Scanner myReader = new Scanner(myObj);
			SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-yyyy HH:mm:ss");
			while (myReader.hasNextLine()) {
				String data = myReader.nextLine();
				String[] splitData = data.split(";",3);
				
				PaymentReceipt s;
				s = new PaymentReceipt();
				pymtRcpt.add(s);
				
				

			}
			myReader.close();
		} catch (FileNotFoundException e) {
			System.out.println("An error occurred.");
			e.printStackTrace();
		}
		return pymtRcpt;
	}

	
}
