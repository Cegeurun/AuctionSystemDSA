package com.dsa;
import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

import com.dsa.admin.AdminPanel;

public class WelcomeFrame extends JPanel {
    private AuctionSystem system;

    public WelcomeFrame(AuctionSystem system) {
        this.system = system;
        setLayout(new BorderLayout());

        JLabel welcomeLabel = new JLabel("Welcome to Auction Online House", SwingConstants.CENTER);
        JButton adminButton = new JButton("Admin");
        JButton customerButton = new JButton("Customer");

        adminButton.addActionListener(e -> system.showPanel(new AdminPanel(system)));
        // customerButton.addActionListener(e -> system.showPanel(new CustomerPanel(system)));

        JPanel buttonPanel = new JPanel();
        buttonPanel.add(adminButton);
        buttonPanel.add(customerButton);

        add(welcomeLabel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);
    }
}