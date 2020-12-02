package Controller;

import View.*;
import Model.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class SearchEngine {

    private SeatMapGUI seatMap;
    private SearchGUI searchView;
    private TransactionGUI transactionGUI;
    //private TheaterList theaterList;
    private OfferingList offeringList;
    private User user;

    public SearchEngine(SeatMapGUI seatMap, SearchGUI searchView, TransactionGUI transactionGUI,
                        OfferingList offeringList) {

        this.seatMap = seatMap;
        this.searchView = searchView;
        this.transactionGUI = transactionGUI;
        //this.theaterList = theaterList;
        this.offeringList = offeringList;

        addSearchViewListeners();
        addSeatMapListeners();
        searchView.addTheatersToComboBox(offeringList.listTheaterNames());

    }


    private void addSeatMapListeners() {
        seatMap.addPurchaseButtonListener(new purchaseButtonListener());
        seatMap.addSeat1ButtonListener(new seat1ButtonListener());
        seatMap.addSeat2ButtonListener(new seat2ButtonListener());
        seatMap.addSeat3ButtonListener(new seat3ButtonListener());
        seatMap.addSeat4ButtonListener(new seat4ButtonListener());
        seatMap.addSeat5ButtonListener(new seat5ButtonListener());
        seatMap.addSeat6ButtonListener(new seat6ButtonListener());
        seatMap.addSeat7ButtonListener(new seat7ButtonListener());
        seatMap.addSeat8ButtonListener(new seat8ButtonListener());
        seatMap.addSeat9ButtonListener(new seat9ButtonListener());
        seatMap.addSeat10ButtonListener(new seat10ButtonListener());
        seatMap.addSeat11ButtonListener(new seat11ButtonListener());
        seatMap.addSeat12ButtonListener(new seat12ButtonListener());
        seatMap.addSeat13ButtonListener(new seat13ButtonListener());
        seatMap.addSeat14ButtonListener(new seat14ButtonListener());
        seatMap.addSeat15ButtonListener(new seat15ButtonListener());
        seatMap.addSeat16ButtonListener(new seat16ButtonListener());
        seatMap.addSeat17ButtonListener(new seat17ButtonListener());
        seatMap.addSeat18ButtonListener(new seat18ButtonListener());
        seatMap.addSeat19ButtonListener(new seat19ButtonListener());
        seatMap.addSeat20ButtonListener(new seat20ButtonListener());
    }

    class seat1ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
        	seatMap.selectSeat(1);
        	
        }
    }

    class seat2ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
        	seatMap.selectSeat(2);
        }
    }

    class seat3ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
        	seatMap.selectSeat(3);
        }
    }

    class seat4ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
        	seatMap.selectSeat(4);
        }
    }

    class seat5ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
        	seatMap.selectSeat(5);
        }
    }

    class seat6ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
        	seatMap.selectSeat(6);
        }
    }

    class seat7ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
        	seatMap.selectSeat(7);
        }
    }

    class seat8ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
        	seatMap.selectSeat(8);
        }
    }

    class seat9ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
        	seatMap.selectSeat(9);
        }
    }

    class seat10ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
        	seatMap.selectSeat(10);
        }
    }

    class seat11ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
        	seatMap.selectSeat(11);
        }
    }

    class seat12ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
        	seatMap.selectSeat(12);
        }
    }

    class seat13ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
        	seatMap.selectSeat(13);
        }
    }

    class seat14ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
        	seatMap.selectSeat(14);
        }
    }

    class seat15ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
        	seatMap.selectSeat(15);
        }
    }

    class seat16ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
        	seatMap.selectSeat(16);
        }
    }

    class seat17ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
        	seatMap.selectSeat(17);
        }
    }

    class seat18ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
        	seatMap.selectSeat(18);
        }
    }

    class seat19ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
        	seatMap.selectSeat(19);
        }
    }

    class seat20ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
        	seatMap.selectSeat(20);
        }
    }

    class purchaseButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
        	transactionGUI.clearSeat();
        	for(int i = 1; i <= 20; i++)
        		if(seatMap.isSelected(i) && seatMap.getSchedule().isVacant(i)) transactionGUI.addSeat(seatMap.getSchedule().searchSeat(i));
        	if(transactionGUI.getSeat().isEmpty()) {
        		seatMap.setWarning("You must select at least one vacant seat.");
        		return;
        	}
        	double ratio = transactionGUI.getSeat().size()/seatMap.getSchedule().getSeatReservation().size();
        	if((user instanceof RegisteredUser) && seatMap.getSchedule().registeredRate() + ratio > 0.1) {
        		//Suppose that public announcement comes 7 days before showtime
        		Date today = new Date();
        		if(seatMap.getSchedule().getShowtime().getTime() - today.getTime() > 604800000) {
        			seatMap.setWarning("No more available seats for registered customer.");
        			return;
        		}
        	}  		
            seatMap.setState(Frame.ICONIFIED); 
            transactionGUI.setSeatReminder();
            transactionGUI.displayGUI();
        }
    }



    private void addSearchViewListeners() {
        searchView.addMovieComboBoxListener(new movieComboBoxListener());
        searchView.addTheaterComboBoxListener(new theaterComboBoxListener());
        searchView.addShowtimeComboBoxListener(new showtimeComboBoxListener());
        searchView.addViewSeatButtonActionListener(new viewSeatButtonListener());

    }

    public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}

	class theaterComboBoxListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String theaterName = searchView.getTheaterComboBoxItem();
            searchView.addMoviesToComboBox(offeringList.listMovieNames(theaterName));
        }
    }

    class movieComboBoxListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String theaterName = searchView.getTheaterComboBoxItem();
            String movieName = searchView.getMovieComboBoxItem();
            searchView.addShowtimesToComboBox(offeringList.listSchedule(movieName, theaterName));
        }
    }

    class showtimeComboBoxListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String showtime = searchView.getShowtimeComboBoxItem();
        }
    }

    class viewSeatButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
        	String movieName = searchView.getMovieComboBoxItem();
        	String theaterName = searchView.getTheaterComboBoxItem();
        	String date = searchView.getShowtimeComboBoxItem();
        	Schedule schedule = offeringList.searchSchedule(movieName, theaterName, date);
        	seatMap.setSchedule(schedule);

            searchView.setState(Frame.ICONIFIED);
            seatMap.displayGUI();
        }
    }


}
