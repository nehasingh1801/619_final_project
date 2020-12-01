package Controller;

import View.*;
import Model.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SearchEngine {

    private SeatMapGUI seatMap;
    private SearchGUI searchView;
    private TransactionGUI transactionGUI;
    private TheaterList theaterList;

    public SearchEngine(SeatMapGUI seatMap, SearchGUI searchView, TransactionGUI transactionGUI, TheaterList theaterList) {
        this.seatMap = seatMap;
        this.searchView = searchView;
        this.transactionGUI = transactionGUI;
        this.theaterList = theaterList;

        addSearchViewListeners();
        addSeatMapListeners();
        searchView.addTheatersToComboBox(theaterList.listTheaterNames());

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

        }
    }

    class seat2ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

        }
    }

    class seat3ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

        }
    }

    class seat4ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

        }
    }

    class seat5ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

        }
    }

    class seat6ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

        }
    }

    class seat7ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

        }
    }

    class seat8ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

        }
    }

    class seat9ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

        }
    }

    class seat10ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

        }
    }

    class seat11ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

        }
    }

    class seat12ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

        }
    }

    class seat13ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

        }
    }

    class seat14ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

        }
    }

    class seat15ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

        }
    }

    class seat16ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

        }
    }

    class seat17ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

        }
    }

    class seat18ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

        }
    }

    class seat19ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

        }
    }

    class seat20ButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

        }
    }


    private void addSearchViewListeners() {
        searchView.addMovieComboBoxListener(new movieComboBoxListener());
        searchView.addTheaterComboBoxListener(new theaterComboBoxListener());
        searchView.addShowtimeComboBoxListener(new showtimeComboBoxListener());
        searchView.addViewSeatButtonActionListener(new viewSeatButtonListener());
        searchView.addRefundButtonActionListener(new refundButtonListener());
    }

    class purchaseButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            transactionGUI.displayGUI();
        }
    }

    class movieComboBoxListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

        }
    }

    class theaterComboBoxListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            //searchView.addTheatersToComboBox(theaterList.listTheaterNames());
        }
    }

    class showtimeComboBoxListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

        }
    }

    class viewSeatButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {

        }
    }

    class refundButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (searchView.getReceiptNumber().isEmpty()) {
                searchView.displayErrorMessage("Enter a receipt number to request refund");
            }
            else {
                int receiptNum = Integer.parseInt(searchView.getReceiptNumber());
            }

        }
    }



}
