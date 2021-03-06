package View;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.Color;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import Model.Schedule;
import Model.SeatReservation;
import java.awt.Font;

public class SeatMapGUI extends JFrame {

    // Variables declaration
    private javax.swing.JButton purchaseButton;
    private javax.swing.JLabel screenLabel;
    private javax.swing.JToggleButton seat10Button;
    private javax.swing.JToggleButton seat11Button;
    private javax.swing.JToggleButton seat12Button;
    private javax.swing.JToggleButton seat13Button;
    private javax.swing.JToggleButton seat14Button;
    private javax.swing.JToggleButton seat15Button;
    private javax.swing.JToggleButton seat16Button;
    private javax.swing.JToggleButton seat17Button;
    private javax.swing.JToggleButton seat18Button;
    private javax.swing.JToggleButton seat19Button;
    private javax.swing.JToggleButton seat1Button;
    private javax.swing.JToggleButton seat20Button;
    private javax.swing.JToggleButton seat2Button;
    private javax.swing.JToggleButton seat3Button;
    private javax.swing.JToggleButton seat4Button;
    private javax.swing.JToggleButton seat5Button;
    private javax.swing.JToggleButton seat6Button;
    private javax.swing.JToggleButton seat7Button;
    private javax.swing.JToggleButton seat8Button;
    private javax.swing.JToggleButton seat9Button;
    private final JLabel lblNewLabel = new JLabel("Vacant:");
    private final JLabel lblNewLabel_1 = new JLabel("BLUE");
    private final JLabel lblNewLabel_2 = new JLabel("Booked:");
    private final JLabel lblNewLabel_3 = new JLabel("RED");
    private final JLabel lblNewLabel_4 = new JLabel("Registered:");
    private final JLabel lblNewLabel_5 = new JLabel("MAGENTA");
    private Schedule schedule;
    private JLabel warningLabel;
    // End of variables declaration

    public SeatMapGUI() {
    	lblNewLabel_5.setForeground(Color.MAGENTA);
    	lblNewLabel_3.setForeground(Color.RED);
    	lblNewLabel_3.setBackground(Color.WHITE);
    	lblNewLabel_1.setForeground(Color.BLUE);
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

        screenLabel = new javax.swing.JLabel();
        seat1Button = new javax.swing.JToggleButton();
        seat1Button.setForeground(Color.BLUE);
        seat2Button = new javax.swing.JToggleButton();
        seat2Button.setForeground(Color.BLUE);
        seat3Button = new javax.swing.JToggleButton();
        seat3Button.setForeground(Color.BLUE);
        seat4Button = new javax.swing.JToggleButton();
        seat4Button.setForeground(Color.BLUE);
        seat5Button = new javax.swing.JToggleButton();
        seat5Button.setForeground(Color.BLUE);
        seat6Button = new javax.swing.JToggleButton();
        seat6Button.setForeground(Color.BLUE);
        seat7Button = new javax.swing.JToggleButton();
        seat7Button.setForeground(Color.BLUE);
        seat8Button = new javax.swing.JToggleButton();
        seat8Button.setForeground(Color.BLUE);
        seat9Button = new javax.swing.JToggleButton();
        seat9Button.setForeground(Color.BLUE);
        seat10Button = new javax.swing.JToggleButton();
        seat10Button.setForeground(Color.BLUE);
        seat11Button = new javax.swing.JToggleButton();
        seat11Button.setForeground(Color.BLUE);
        seat12Button = new javax.swing.JToggleButton();
        seat12Button.setForeground(Color.BLUE);
        purchaseButton = new javax.swing.JButton();
        seat13Button = new javax.swing.JToggleButton();
        seat13Button.setForeground(Color.BLUE);
        seat14Button = new javax.swing.JToggleButton();
        seat14Button.setForeground(Color.BLUE);
        seat15Button = new javax.swing.JToggleButton();
        seat15Button.setForeground(Color.BLUE);
        seat16Button = new javax.swing.JToggleButton();
        seat16Button.setForeground(Color.BLUE);
        seat17Button = new javax.swing.JToggleButton();
        seat17Button.setForeground(Color.BLUE);
        seat18Button = new javax.swing.JToggleButton();
        seat18Button.setForeground(Color.BLUE);
        seat19Button = new javax.swing.JToggleButton();
        seat19Button.setForeground(Color.BLUE);
        seat20Button = new javax.swing.JToggleButton();
        seat20Button.setForeground(Color.BLUE);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Seat Map");
        setResizable(false);

        screenLabel.setFont(new Font("Dialog", Font.PLAIN, 13)); // NOI18N
        screenLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        screenLabel.setText("SCREEN");

        seat1Button.setText("1");

        seat2Button.setText("2");

        seat3Button.setText("3");

        seat4Button.setText("4");

        seat5Button.setText("5");

        seat6Button.setText("6");

        seat7Button.setText("7");

        seat8Button.setText("8");

        seat9Button.setText("9");
        seat9Button.setToolTipText("");

        seat10Button.setText("10");

        seat11Button.setText("11");

        seat12Button.setText("12");

        purchaseButton.setText("Purchase Tickets");

        seat13Button.setText("13");

        seat14Button.setText("14");

        seat15Button.setText("15");

        seat16Button.setText("16");

        seat17Button.setText("17");

        seat18Button.setText("18");

        seat19Button.setText("19");

        seat20Button.setText("20");
        
        warningLabel = new JLabel("");
        warningLabel.setForeground(Color.RED);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        layout.setHorizontalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGroup(layout.createParallelGroup(Alignment.LEADING)
        				.addGroup(layout.createSequentialGroup()
        					.addGap(38)
        					.addGroup(layout.createParallelGroup(Alignment.LEADING)
        						.addComponent(screenLabel, GroupLayout.PREFERRED_SIZE, 274, GroupLayout.PREFERRED_SIZE)
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(seat11Button, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(seat12Button, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(seat13Button, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(seat14Button, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(seat15Button, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(seat6Button, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(seat7Button, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(seat8Button, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(seat9Button, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(seat10Button, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(seat16Button, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addGroup(layout.createParallelGroup(Alignment.LEADING, false)
        								.addGroup(layout.createSequentialGroup()
        									.addComponent(seat17Button, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
        									.addPreferredGap(ComponentPlacement.RELATED)
        									.addComponent(seat18Button, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
        									.addPreferredGap(ComponentPlacement.RELATED)
        									.addComponent(seat19Button, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
        								.addComponent(purchaseButton, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(seat20Button, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
        						.addGroup(layout.createSequentialGroup()
        							.addComponent(seat1Button, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(seat2Button, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addComponent(seat3Button, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
        							.addPreferredGap(ComponentPlacement.RELATED)
        							.addGroup(layout.createParallelGroup(Alignment.LEADING)
        								.addGroup(layout.createSequentialGroup()
        									.addComponent(lblNewLabel_4)
        									.addPreferredGap(ComponentPlacement.RELATED)
        									.addComponent(lblNewLabel_5))
        								.addGroup(layout.createSequentialGroup()
        									.addComponent(seat4Button, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
        									.addPreferredGap(ComponentPlacement.RELATED)
        									.addComponent(seat5Button, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))))))
        				.addGroup(layout.createSequentialGroup()
        					.addContainerGap()
        					.addComponent(lblNewLabel)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(lblNewLabel_1)
        					.addGap(30)
        					.addComponent(lblNewLabel_2)
        					.addPreferredGap(ComponentPlacement.RELATED)
        					.addComponent(lblNewLabel_3))
        				.addGroup(layout.createSequentialGroup()
        					.addGap(125)
        					.addComponent(warningLabel)))
        			.addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
        	layout.createParallelGroup(Alignment.LEADING)
        		.addGroup(layout.createSequentialGroup()
        			.addGap(17)
        			.addComponent(screenLabel)
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(lblNewLabel)
        				.addComponent(lblNewLabel_1)
        				.addComponent(lblNewLabel_2)
        				.addComponent(lblNewLabel_3)
        				.addComponent(lblNewLabel_4)
        				.addComponent(lblNewLabel_5))
        			.addGap(36)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(seat1Button, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
        				.addComponent(seat2Button, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
        				.addComponent(seat3Button, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
        				.addComponent(seat4Button, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
        				.addComponent(seat5Button, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(seat6Button, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
        				.addComponent(seat7Button, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
        				.addComponent(seat8Button, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
        				.addComponent(seat9Button, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
        				.addComponent(seat10Button, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(seat11Button, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
        				.addComponent(seat12Button, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
        				.addComponent(seat13Button, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
        				.addComponent(seat14Button, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
        				.addComponent(seat15Button, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.RELATED)
        			.addGroup(layout.createParallelGroup(Alignment.BASELINE)
        				.addComponent(seat16Button, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
        				.addComponent(seat17Button, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
        				.addComponent(seat18Button, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
        				.addComponent(seat19Button, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
        				.addComponent(seat20Button, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
        			.addPreferredGap(ComponentPlacement.UNRELATED)
        			.addComponent(warningLabel)
        			.addPreferredGap(ComponentPlacement.RELATED, 13, Short.MAX_VALUE)
        			.addComponent(purchaseButton)
        			.addGap(34))
        );
        getContentPane().setLayout(layout);

        pack();
    }// </editor-fold>


    public void addPurchaseButtonListener(ActionListener listenForPurchaseButton) {
        purchaseButton.addActionListener(listenForPurchaseButton);
    }

    public void addSeat1ButtonListener(ActionListener listenForSeat1Button) {
        seat1Button.addActionListener(listenForSeat1Button);
    }

    public void addSeat2ButtonListener(ActionListener listenForSeat2Button) {
        seat2Button.addActionListener(listenForSeat2Button);
    }

    public void addSeat3ButtonListener(ActionListener listenForSeat3Button) {
        seat3Button.addActionListener(listenForSeat3Button);
    }

    public void addSeat4ButtonListener(ActionListener listenForSeat4Button) {
        seat4Button.addActionListener(listenForSeat4Button);
    }

    public void addSeat5ButtonListener(ActionListener listenForSeat5Button) {
        seat5Button.addActionListener(listenForSeat5Button);
    }

    public void addSeat6ButtonListener(ActionListener listenForSeat6Button) {
        seat6Button.addActionListener(listenForSeat6Button);
    }

    public void addSeat7ButtonListener(ActionListener listenForSeat7Button) {
        seat7Button.addActionListener(listenForSeat7Button);
    }

    public void addSeat8ButtonListener(ActionListener listenForSeat8Button) {
        seat8Button.addActionListener(listenForSeat8Button);
    }

    public void addSeat9ButtonListener(ActionListener listenForSeat9Button) {
        seat9Button.addActionListener(listenForSeat9Button);
    }

    public void addSeat10ButtonListener(ActionListener listenForSeat10Button) {
        seat10Button.addActionListener(listenForSeat10Button);
    }

    public void addSeat11ButtonListener(ActionListener listenForSeat11Button) {
        seat11Button.addActionListener(listenForSeat11Button);
    }

    public void addSeat12ButtonListener(ActionListener listenForSeat12Button) {
        seat12Button.addActionListener(listenForSeat12Button);
    }

    public void addSeat13ButtonListener(ActionListener listenForSeat13Button) {
        seat13Button.addActionListener(listenForSeat13Button);
    }

    public void addSeat14ButtonListener(ActionListener listenForSeat14Button) {
        seat14Button.addActionListener(listenForSeat14Button);
    }

    public void addSeat15ButtonListener(ActionListener listenForSeat15Button) {
        seat15Button.addActionListener(listenForSeat15Button);
    }

    public void addSeat16ButtonListener(ActionListener listenForSeat16Button) {
        seat16Button.addActionListener(listenForSeat16Button);
    }

    public void addSeat17ButtonListener(ActionListener listenForSeat17Button) {
        seat17Button.addActionListener(listenForSeat17Button);
    }

    public void addSeat18ButtonListener(ActionListener listenForSeat18Button) {
        seat18Button.addActionListener(listenForSeat18Button);
    }

    public void addSeat19ButtonListener(ActionListener listenForSeat19Button) {
        seat19Button.addActionListener(listenForSeat19Button);
    }

    public void addSeat20ButtonListener(ActionListener listenForSeat20Button) {
        seat20Button.addActionListener(listenForSeat20Button);
    }
    
    public void setWarning(String warning) {
    	warningLabel.setText(warning);
    }
    
    public void selectSeat(int i) {
    	switch(i) {
    	case 1:
    		seat1Button.getModel().setPressed(false);
    		break;
    	case 2:
			seat2Button.getModel().setPressed(false);
    		break;
    	case 3:
    		seat3Button.getModel().setPressed(false);
    		break;
    	case 4:
    		seat4Button.getModel().setPressed(false);
    		break;
    	case 5:
    		seat5Button.getModel().setPressed(false);
    		break;
    	case 6:
    		seat6Button.getModel().setPressed(false);
    		break;
    	case 7:
    		seat7Button.getModel().setPressed(false);
    		break;
    	case 8:
    		seat8Button.getModel().setPressed(false);
    		break;
    	case 9:
    		seat9Button.getModel().setPressed(false);
    		break;
    	case 10:
    		seat10Button.getModel().setPressed(false);
    		break;
    	case 11:
    		seat11Button.getModel().setPressed(false);
    		break;
    	case 12:
    		seat12Button.getModel().setPressed(false);
    		break;
    	case 13:
    		seat13Button.getModel().setPressed(false);
    		break;
    	case 14:
    		seat14Button.getModel().setPressed(false);
    		break;
    	case 15:
    		seat15Button.getModel().setPressed(false);
    		break;
    	case 16:
    		seat16Button.getModel().setPressed(false);
    		break;
    	case 17:
    		seat17Button.getModel().setPressed(false);
    		break;
    	case 18:
    		seat18Button.getModel().setPressed(false);
    		break;
    	case 19:
    		seat19Button.getModel().setPressed(false);
    		break;
    	default:
    		seat20Button.getModel().setPressed(false);
    	}
    }
    
    public void unselectAll() {
    	seat1Button.setSelected(false);
    	seat2Button.setSelected(false);
    	seat3Button.setSelected(false);
    	seat4Button.setSelected(false);
    	seat5Button.setSelected(false);
    	seat6Button.setSelected(false);
    	seat7Button.setSelected(false);
    	seat8Button.setSelected(false);
    	seat9Button.setSelected(false);
    	seat10Button.setSelected(false);
    	seat11Button.setSelected(false);
    	seat12Button.setSelected(false);
    	seat13Button.setSelected(false);
    	seat14Button.setSelected(false);
    	seat15Button.setSelected(false);
    	seat16Button.setSelected(false);
    	seat17Button.setSelected(false);
    	seat18Button.setSelected(false);
    	seat19Button.setSelected(false);
    	seat20Button.setSelected(false);
    }

    public void setSchedule(Schedule s) {
    	this.schedule = s;
    	setButtonColor(seat1Button, 1);
    	setButtonColor(seat2Button, 2);
    	setButtonColor(seat3Button, 3);
    	setButtonColor(seat4Button, 4);
    	setButtonColor(seat5Button, 5);
    	setButtonColor(seat6Button, 6);
    	setButtonColor(seat7Button, 7);
    	setButtonColor(seat8Button, 8);
    	setButtonColor(seat9Button, 9);
    	setButtonColor(seat10Button, 10);
    	setButtonColor(seat11Button, 11);
    	setButtonColor(seat12Button, 12);
    	setButtonColor(seat13Button, 13);
    	setButtonColor(seat14Button, 14);
    	setButtonColor(seat15Button, 15);
    	setButtonColor(seat16Button, 16);
    	setButtonColor(seat17Button, 17);
    	setButtonColor(seat18Button, 18);
    	setButtonColor(seat19Button, 19);
    	setButtonColor(seat20Button, 20);
    }
    
    public boolean isSelected(int i) {
    	switch(i) {
    	case 1:
    		return seat1Button.isSelected();
    	case 2:
    		return seat2Button.isSelected();
    	case 3:
    		return seat3Button.isSelected();
    	case 4:
    		return seat4Button.isSelected();
    	case 5:
    		return seat5Button.isSelected();
    	case 6:
    		return seat6Button.isSelected();
    	case 7:
    		return seat7Button.isSelected();
    	case 8:
    		return seat8Button.isSelected();
    	case 9:
    		return seat9Button.isSelected();
    	case 10:
    		return seat10Button.isSelected();
    	case 11:
    		return seat11Button.isSelected();
    	case 12:
    		return seat12Button.isSelected();
    	case 13:
    		return seat13Button.isSelected();
    	case 14:
    		return seat14Button.isSelected();
    	case 15:
    		return seat15Button.isSelected();
    	case 16:
    		return seat16Button.isSelected();
    	case 17:
    		return seat17Button.isSelected();
    	case 18:
    		return seat18Button.isSelected();
    	case 19:
    		return seat19Button.isSelected();
    	default:
    		return seat20Button.isSelected();
    	}
    }
    
    public Schedule getSchedule() {
    	return schedule;
    }
    
    private void setButtonColor(JToggleButton bt, int num) {
    	SeatReservation seat = this.schedule.searchSeat(num);
    	switch (seat.getBookingStatus()) {
    	case "registered":
    		bt.setForeground(Color.MAGENTA);
    		break;
    	case "booked":
    		bt.setForeground(Color.RED);
    		break;
    	default:
    		bt.setForeground(Color.BLUE);
    	}
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
            java.util.logging.Logger.getLogger(SeatMapGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SeatMapGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SeatMapGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SeatMapGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

