package Controller;


import View.*;
import Model.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ManagePurchase {

    private TransactionGUI transactionGUI;
    private User user;

    public ManagePurchase(TransactionGUI transactionGUI) {
        this.transactionGUI = transactionGUI;
        transactionGUI.addPurchaseButtonListener(new confirmPurchaseListener());
    }
    
    public void fillText() {
    	if(!(user instanceof RegisteredUser)) return;
    	RegisteredUser temp = (RegisteredUser)user;
    	transactionGUI.setText(temp.getName(), temp.getAddress(), temp.getUsername(), String.valueOf(temp.getCreditcardNumber()));
    }
    
    public void setUser(User u) {
    	user = u;
    	fillText();
    }

    public User getUser() {
        return user;
    }
    

    class confirmPurchaseListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if(transactionGUI.getNameField().isEmpty() | transactionGUI.getAddress().isEmpty() |
                    transactionGUI.getEmail().isEmpty() | transactionGUI.getCardNum().isEmpty()) {
                transactionGUI.displayErrorMessage("Enter all required information to complete purchase");
                return;
            }
            for(SeatReservation s : transactionGUI.getSeat()) {
            	String bookingStatus = (user instanceof RegisteredUser)? "registered" : "booked";
            	s.setBookingStatus(bookingStatus);
            }
            //TODO: add code to create tickets and receipt
            //TODO: add code to handle whether voucher is provided or not (including verification)
            transactionGUI.dispose();
        }
    }

}
