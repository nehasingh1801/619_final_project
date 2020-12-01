package Controller;

import View.*;

public class Main {

    public static void main(String[] args) {
        LoginGUI login = new LoginGUI();
        SearchGUI search = new SearchGUI();
        SeatMapGUI seats = new SeatMapGUI();
        TransactionGUI trans = new TransactionGUI();
        UserInfoGUI user = new UserInfoGUI();

        ManagePurchase managePurchase = new ManagePurchase(trans);
        ManageUser manageUser = new ManageUser(login, user, search);
        SearchEngine searchEngine = new SearchEngine(seats, search, trans);

        login.displayGUI();
    }
}
