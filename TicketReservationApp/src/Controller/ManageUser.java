package Controller;

import View.*;
import Model.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ManageUser {

    private LoginGUI loginView;
    private UserInfoGUI userView;
    private SearchGUI searchGUI;
    private MemberPortal memberPortal;
    private ManagePurchase purchaseController;
    private SearchEngine searchController;
    private RegisteredUserList regList;

    public ManageUser(LoginGUI loginView, UserInfoGUI userView, SearchEngine searchView, MemberPortal memberPortal, SearchGUI searchGUI, RegisteredUserList regList, ManagePurchase purchaseController) {
        this.loginView = loginView;
        this.userView = userView;
        this.searchController = searchView;
        this.memberPortal = memberPortal;
        this.searchGUI = searchGUI;
        this.regList = regList;
        this.purchaseController = purchaseController;

        addUserViewListeners();
        addLoginViewListeners();
        addMemberPortalListeners();
    }
    
    

    /*
    Below code relates to LoginGUI
     */
    private void addLoginViewListeners() {
        loginView.addGuestButtonListener(new guestButtonListener());
        loginView.addLoginButtonListener(new loginButtonListener());
        loginView.addRegisterButtonListener(new newRegistrationButtonListener());
    }

    class loginButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if(loginView.getUserField().isEmpty() | loginView.getPasswordField().isEmpty()) {
                loginView.displayErrorMessage("Enter both username and password to login");
            }
            //TODO: verify login info and then display searchGUI as a registered user
            else {
                if (regList.validateLogin(loginView.getUserField(), loginView.getPasswordField())) {
                	RegisteredUser user = regList.searchUser(loginView.getUserField());
                	purchaseController.setUser(user);
                	purchaseController.setUser(user);
                    loginView.setState(Frame.ICONIFIED);
                    memberPortal.displayGUI();
                }

                else {
                    loginView.displayErrorMessage("Username or password incorrect");
                }
            }

        }
    }

    class newRegistrationButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            //display UserInfoGUI
            loginView.setState(Frame.ICONIFIED);
            userView.displayGUI();
        }
    }

    class guestButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            //TODO: display searchGUI as an ordinary user
        	User guest = new User();
        	searchController.setUser(guest);
        	purchaseController.setUser(guest);
            loginView.setState(Frame.ICONIFIED);
            searchGUI.displayGUI();
        }
    }

    /*
    Below code relates to UserInfoGUI
     */
    private void addUserViewListeners() {
        userView.addRegisterButtonListener(new registerButtonListener());
    }

    class registerButtonListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            if (userView.getAddressField().isEmpty() | userView.getNameField().isEmpty() |
                userView.getUsernameField().isEmpty() | userView.getPasswordField().isEmpty() |
                userView.getCardNumField().isEmpty()) {

                userView.displayErrorMessage("Please enter all values to register user");
            }

            else {
                RegisteredUser regUser = new RegisteredUser(userView.getNameField(), userView.getUsernameField(),
                        userView.getPasswordField(), userView.getAddressField(),
                        Long.parseLong(userView.getCardNumField()), new Date());

                userView.displayRegistrationMessage("User successfully registered");
                //TODO: add regUser to RegisteredUserList
                regList.addRegisteredUser(regUser);
            }
        }
    }


    private void addMemberPortalListeners() {
        memberPortal.addBookShowtimeListener(new bookShowtimeListener());
        memberPortal.addPayAnnualFeeListener(new payAnnualFeeListener());
        memberPortal.addGetMovieNewsListener(new getMovieNewsListener());
    }

    class bookShowtimeListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            memberPortal.setState(Frame.ICONIFIED);
            searchGUI.displayGUI();
        }
    }

    class payAnnualFeeListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            RegisteredUser user = regList.searchUser(loginView.getUserField());
            memberPortal.displayMessage(user.payUserFee());
        }
    }

    class getMovieNewsListener implements ActionListener {
        public void actionPerformed(ActionEvent e){
            memberPortal.displayMessage("The Batman Out March 4, 2022!");
        }
    }




}
