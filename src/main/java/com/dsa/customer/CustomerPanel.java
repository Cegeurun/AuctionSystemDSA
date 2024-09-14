package com.dsa.customer;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.dsa.AuctionSystem;
import com.dsa.WelcomeFrame;

public class CustomerPanel extends JPanel {

    public CustomerPanel(AuctionSystem system) {
        setLayout(new BorderLayout());

        JPanel controlPanel = new JPanel();
        JTextField bidderNameField = new JTextField(15);  // Bidder Name -> Text Field for INSERT
        JTextField bidPriceField = new JTextField(10);    // Bid Price   -> Text Field fo INSERT
        JButton addBidButton = new JButton("Add Bid"); 
        JButton closeButton = new JButton("Close");

        // addBidButton.addActionListener(e -> handleBid());
        closeButton.addActionListener(e -> system.showPanel(new WelcomeFrame(system)));

        controlPanel.add(new JLabel("Bidder Name: "));
        controlPanel.add(bidderNameField);
        controlPanel.add(new JLabel("Bid Price: "));
        controlPanel.add(bidPriceField);
        controlPanel.add(addBidButton);
        controlPanel.add(closeButton);

        add(controlPanel, BorderLayout.WEST);

        // VISABLE TABLE of bid

        // JTable bidTable = JTable();
        // add(new JScrollPane(bidTable), BorderLayout.CENTER);

    }

    private void handleAddBid() {
        // FUNCS  to add Bid and Management.
    }



}
