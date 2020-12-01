package Controller;

import View.*;
import Model.*;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ManageUser {

    private LoginGUI loginView;
    private UserInfoGUI userView;
    private SearchGUI searchGUI;

    public ManageUser(LoginGUI loginView, UserInfoGUI userView, SearchGUI searchGUI) {
        this.loginView = loginView;
        this.userView = userView;
        this.searchGUI = searchGUI;

        addUserViewListeners();
        addLoginViewListeners();
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
                loginView.setState(Frame.ICONIFIED);
                searchGUI.displayGUI();
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
                        Integer.parseInt(userView.getCardNumField()));

                userView.displayRegistrationMessage("User successfully registered");
                //TODO: add regUser to RegisteredUserList
            }
        }
    }




}
