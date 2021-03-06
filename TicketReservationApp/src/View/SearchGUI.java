package View;

import Model.Theater;

import javax.swing.*;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

public class SearchGUI extends JFrame {

    // Variables declaration
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JComboBox<String> movieComboBox;
    private javax.swing.JLabel movieLabel;
    private javax.swing.JLabel newTicketLabel;
    private javax.swing.JTextField receiptNumField;
    private javax.swing.JLabel receiptNumLabel;
    private javax.swing.JButton refundButton;
    private javax.swing.JLabel refundLabel;
    private javax.swing.JComboBox<String> showtimeComboBox;
    private javax.swing.JLabel showtimeLabel;
    private javax.swing.JComboBox<String> theaterComboBox;
    private javax.swing.JLabel theaterLabel;
    private javax.swing.JButton viewSeatsButton;
    private javax.swing.DefaultComboBoxModel<String> dmTheater;


    public SearchGUI() {
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

        theaterLabel = new javax.swing.JLabel();
        movieLabel = new javax.swing.JLabel();
        showtimeLabel = new javax.swing.JLabel();
        theaterComboBox = new javax.swing.JComboBox<>();
        movieComboBox = new javax.swing.JComboBox<>();
        showtimeComboBox = new javax.swing.JComboBox<>();
        viewSeatsButton = new javax.swing.JButton();
        newTicketLabel = new javax.swing.JLabel();
        refundLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        receiptNumField = new javax.swing.JTextField();
        receiptNumLabel = new javax.swing.JLabel();
        refundButton = new javax.swing.JButton();
        dmTheater = new javax.swing.DefaultComboBoxModel<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Purchase or Refund Ticket");
        setResizable(false);

        theaterLabel.setText("Theaters");

        movieLabel.setText("Movie");

        showtimeLabel.setText("Showtime");

        dmTheater.addElement( "SELECT THEATER" );
        theaterComboBox.setModel(dmTheater);


        viewSeatsButton.setText("View Seat Map");

        newTicketLabel.setText("Purchase New Ticket");

        refundLabel.setText("Refund Ticket");

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        receiptNumField.setToolTipText("");

        receiptNumLabel.setText("Receipt Number");

        refundButton.setText("Refund Ticket");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(38, 38, 38)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(showtimeLabel)
                                                                .addGap(19, 19, 19)
                                                                .addComponent(showtimeComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(movieLabel)
                                                                        .addComponent(theaterLabel))
                                                                .addGap(26, 26, 26)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(movieComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(theaterComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addComponent(newTicketLabel))))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(viewSeatsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(81, 81, 81)))
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addComponent(receiptNumField, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                                .addComponent(receiptNumLabel)
                                                                .addGap(22, 22, 22))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                .addComponent(refundButton, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(55, 55, 55))))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(90, 90, 90)
                                                .addComponent(refundLabel))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jSeparator1)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                .addComponent(refundLabel)
                                                                .addGap(42, 42, 42)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(receiptNumLabel)
                                                                        .addComponent(receiptNumField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGap(28, 28, 28)
                                                                .addComponent(refundButton))
                                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                .addComponent(newTicketLabel)
                                                                .addGap(18, 18, 18)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(theaterLabel)
                                                                        .addComponent(theaterComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(movieLabel)
                                                                        .addComponent(movieComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                                        .addComponent(showtimeLabel)
                                                                        .addComponent(showtimeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                                                .addComponent(viewSeatsButton)))
                                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>


    public void addTheatersToComboBox(String[] theaterList) {
        for(int i = 0; i<theaterList.length; i++) {
            dmTheater.addElement(theaterList[i]);
        }

        theaterComboBox.setModel(dmTheater);
    }

    public void addMoviesToComboBox(String[] movieList) {
        movieComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(movieList));
    }

    public void addShowtimesToComboBox(String[] showtimes) {
        showtimeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(showtimes));
    }

    public void addMovieComboBoxListener(ActionListener listenForMovieComboBox) {
        movieComboBox.addActionListener(listenForMovieComboBox);
    }

    public void addTheaterComboBoxListener(ActionListener listenForTheaterComboBox) {
        theaterComboBox.addActionListener(listenForTheaterComboBox);
    }

    public void addShowtimeComboBoxListener(ActionListener listenForShowtimeComboBox) {
        showtimeComboBox.addActionListener(listenForShowtimeComboBox);
    }

    public void addViewSeatButtonActionListener(ActionListener listenForViewSeatButton) {
        viewSeatsButton.addActionListener(listenForViewSeatButton);
    }

    public void addRefundButtonActionListener(ActionListener listenForRefundButton) {
        refundButton.addActionListener(listenForRefundButton);
    }

    public String getReceiptNumber() {
        return receiptNumField.getText();
    }

    public String getMovieComboBoxItem() {
        return (String) movieComboBox.getSelectedItem();
    }

    public String getTheaterComboBoxItem() {
        return (String) theaterComboBox.getSelectedItem();
    }

    public String getShowtimeComboBoxItem() {
        return (String) showtimeComboBox.getSelectedItem();
    }

    public void displayErrorMessage(String errorMessage) {
        JOptionPane.showMessageDialog(this, errorMessage);
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
            java.util.logging.Logger.getLogger(SearchGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SearchGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SearchGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SearchGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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

