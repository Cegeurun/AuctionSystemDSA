package com.dsa.admin;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import com.dsa.AuctionSystem; // Connectivity Overall SUPEFAST
import com.dsa.WelcomeFrame;

/**
 * ADMIN PANEL
 * - Adding ITEMS -> Button
 * - START Auction  -> Button
 * - CLOSE Panel -> Button
 * - VISIABLE Table Lists -> Table
 */
public class AdminPanel extends JPanel {

    private AuctionManager manager;

    public AdminPanel(AuctionSystem system) {
        setLayout(new BorderLayout());
        this.manager = new AuctionManager();

        // Swing Main Components INIT
        JPanel controlPanel = new JPanel();
        JButton startAuctionButton = new JButton("Start Auction");
        JButton addItemButton = new JButton("Add Item");
        JButton closeButton = new JButton("Close");

        addItemButton.addActionListener(e -> handleAddItem());
        // startAuctionButton.addActionListener(e -> handleStartAuction());
        closeButton.addActionListener(e -> system.showPanel(new WelcomeFrame(system)));

        controlPanel.add(addItemButton);
        controlPanel.add(startAuctionButton);
        controlPanel.add(closeButton);

        // LEFT SIDE PANEL TO [TABLE VIES]
        add(controlPanel, BorderLayout.WEST);
        JTable itemTable = new JTable();
        add(new JScrollPane(itemTable), BorderLayout.CENTER);

    }

    //---------------------------------FUNCTIONALITY DEVELOPMENT HERE------------------------------>

    private void handleAddItem(){
        // FUNC to add item in [TABLE VIEW]
    }

    private void handleStartAuction(){
        // FUNC to [START AUCTION] 
        // NOT JUST STRART Button, Include Error IFs
    }

}
