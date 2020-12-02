package Controller;

import View.*;
import Model.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ManageCancellation {

    private SearchGUI searchView;
    private ManagePurchase managePurchase;
    private RegisteredUserList regList;

    public ManageCancellation(SearchGUI searchView, ManagePurchase managePurchase, RegisteredUserList regList) {
        this.searchView = searchView;
        this.managePurchase = managePurchase;
        this.regList = regList;

        searchView.addRefundButtonActionListener(new refundButtonListener());

    }

    class refundButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (searchView.getReceiptNumber().isEmpty()) {
                searchView.displayErrorMessage("Enter a receipt number to request refund");
            }
            else {
                int receiptNum = Integer.parseInt(searchView.getReceiptNumber());
                //if valid date
                //  check kind of user and display different messages depending

                //else invalid date
                //display error popup

            }

        }
    }

}
