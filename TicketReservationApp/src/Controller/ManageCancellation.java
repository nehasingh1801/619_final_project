package Controller;

import View.*;
import Model.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class ManageCancellation {

    private SearchGUI searchView;
    private ManagePurchase managePurchase;
    private RegisteredUserList regList;
    private PaymentReceiptList receiptList;
    private User user;

    public ManageCancellation(SearchGUI searchView, ManagePurchase managePurchase, RegisteredUserList regList, PaymentReceiptList receiptList) {
        this.searchView = searchView;
        this.managePurchase = managePurchase;
        this.regList = regList;
        this.receiptList = receiptList;


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
                user = managePurchase.getUser();
                if(user instanceof RegisteredUser) {
                    searchView.displayErrorMessage(receiptList.registeredUSerSearchRcptID(receiptNum, new Date()));
                }
                else {
                    searchView.displayErrorMessage(receiptList.UserSearchReceiptId(receiptNum, new Date()));
                }


            }

        }
    }

}
