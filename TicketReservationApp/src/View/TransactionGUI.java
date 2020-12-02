package View;

import javax.swing.*;

import Model.SeatReservation;

import java.awt.event.ActionListener;
import java.util.ArrayList;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.Font;

public class TransactionGUI extends JFrame {

    // Variables declaration
    private javax.swing.JLabel addressLabel;
    private javax.swing.JLabel cardNumLabel;
    private javax.swing.JLabel emailLabel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JLabel noteLabel;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JLabel voucherLabel;

    private javax.swing.JTextField addressField;
    private javax.swing.JTextField cardNumField;
    private javax.swing.JTextField emailField;
    private javax.swing.JTextField nameField;
    private javax.swing.JTextField voucherNumField;

    private javax.swing.JButton purchaseButton;
    private ArrayList<SeatReservation> seat;
    private JLabel seatReminder;
    // End of variables declaration

    public TransactionGUI() {
    	seat = new ArrayList<SeatReservation>();
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        titleLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        addressLabel = new javax.swing.JLabel();
        emailLabel = new javax.swing.JLabel();
        cardNumLabel = new javax.swing.JLabel();
        noteLabel = new javax.swing.JLabel();
        voucherLabel = new javax.swing.JLabel();
        nameField = new javax.swing.JTextField();
        addressField = new javax.swing.JTextField();
        cardNumField = new javax.swing.JTextField();
        emailField = new javax.swing.JTextField();
        voucherNumField = new javax.swing.JTextField();
        purchaseButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Payment Information");
        setResizable(false);

        titleLabel.setFont(new java.awt.Font("Lucida Grande", 1, 14)); // NOI18N
        titleLabel.setText("Enter Ticket Payment Information:");

        nameLabel.setText("Name");

        addressLabel.setText("Address");

        emailLabel.setText("Email Address");

        cardNumLabel.setText("Card Number");

        noteLabel.setFont(new java.awt.Font("Lucida Grande", 0, 10)); // NOI18N
        noteLabel.setForeground(new java.awt.Color(255, 0, 51));
        noteLabel.setText("Please Note: tickets and receipts are issued via email");

        voucherLabel.setText("Voucher Number");

        purchaseButton.setText("Confirm Purchase");
        
        seatReminder = new JLabel("New label");
        seatReminder.setFont(new Font("Dialog", Font.PLAIN, 10));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(58)
        					.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        						.addGroup(layout.createParallelGroup(Alignment.TRAILING, false)
        							.addGroup(layout.createSequentialGroup()
        								.addComponent(voucherLabel)
        								.addGap(18)
        								.addComponent(voucherNumField))
        							.addComponent(cardNumLabel)
        							.addGroup(layout.createSequentialGroup()
        								.addComponent(emailLabel)
        								.addGap(18)
        								.addComponent(emailField))
        							.addGroup(layout.createParallelGroup(Alignment.LEADING)
        								.addComponent(cardNumField, GroupLayout.PREFERRED_SIZE, 167, GroupLayout.PREFERRED_SIZE)
        								.addGroup(layout.createSequentialGroup()
        									.addGroup(layout.createParallelGroup(Alignment.LEADING)
        										.addComponent(addressLabel)
        										.addComponent(nameLabel))
        									.addGap(37)
        									.addGroup(layout.createParallelGroup(Alignment.TRAILING)
        										.addComponent(nameField, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE)
        										.addComponent(addressField, Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 180, GroupLayout.PREFERRED_SIZE)))))
        						.addComponent(noteLabel)))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(70)
        					.addComponent(titleLabel))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(113)
        					.addComponent(purchaseButton, GroupLayout.PREFERRED_SIZE, 165, GroupLayout.PREFERRED_SIZE))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(102)
        					.addComponent(seatReminder)))
        			.addContainerGap(62, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(19)
        			.addComponent(titleLabel)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addComponent(seatReminder)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(nameLabel)
        				.addComponent(nameField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(addressLabel)
        				.addComponent(addressField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(cardNumLabel)
        				.addComponent(cardNumField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(emailLabel)
        				.addComponent(emailField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(voucherLabel)
        				.addComponent(voucherNumField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
        			.addGap(18)
        			.addComponent(purchaseButton)
        			.addPreferredGap(ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
        			.addComponent(noteLabel)
        			.addGap(33))
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>

    public void setSeatReminder() {
    	String reminder = "You are booking the following seat(s): " + seat.get(0).getSeatNumber();
    	for(int i = 1; i < seat.size(); i++)
    		reminder += ", " + seat.get(i).getSeatNumber();
    	seatReminder.setText(reminder);
    }
    
    public void addSeat(SeatReservation s) {
    	seat.add(s);
    }
    
    public ArrayList<SeatReservation> getSeat(){
    	return seat;
    }
    
    public void setSeat(ArrayList<SeatReservation> seat) {
    	this.seat = seat;
    }
    
    public void clearSeat() {
    	seat = new ArrayList<SeatReservation>();
    }
    
    public void addPurchaseButtonListener(ActionListener listenForPurchaseButton) {
        purchaseButton.addActionListener(listenForPurchaseButton);
    }

    public String getNameField() {
        return nameField.getText();
    }

    public String getAddress() {
        return addressField.getText();
    }

    public String getEmail() {
        return emailField.getText();
    }

    public String getCardNum() {
        return cardNumField.getText();
    }

    public String getVoucherNum() {
        return voucherNumField.getText();
    }

    public void displayErrorMessage(String errorMessage) {
        JOptionPane.showMessageDialog(this, errorMessage);
    }

    public void displayConfirmation(String confirmationMessage) {
        JOptionPane.showMessageDialog(this, confirmationMessage);
    }
    
    public void setText(String name, String address, String email, String cardNum) {
    	nameField.setText(name);
    	addressField.setText(address);
    	emailField.setText(email);
    	cardNumField.setText(cardNum);
    }


    public void displayGUI() {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TransactionGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TransactionGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TransactionGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TransactionGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                setVisible(true);
            }
        });
    }

}
