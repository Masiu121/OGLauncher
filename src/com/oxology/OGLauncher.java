package com.oxology;

import javax.swing.*;

public class OGLauncher extends JFrame {
    private JButton playBtn;
    private JButton newProfileBtn;
    private JButton editProfileBtn;
    private JLabel profileLbl;
    private JComboBox<String> profileSelector;

    OGLauncher() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setBounds(100, 100, 800, 500);
        setResizable(false);

        setupComponents();
        addComponents();

        setVisible(true);
    }

    private void setupComponents() {
        playBtn = new JButton();
        playBtn.setBounds(275, 400, 250, 50);
        playBtn.setText("Play");

        newProfileBtn = new JButton();
        newProfileBtn.setBounds(10, 430, 100, 20);
        newProfileBtn.setText("New Profile");

        editProfileBtn = new JButton();
        editProfileBtn.setBounds(120, 430, 100, 20);
        editProfileBtn.setText("Edit Profile");

        profileLbl = new JLabel();
        profileLbl.setText("Profile:");
        profileLbl.setBounds(10, 400, 50, 20);

        profileSelector = new JComboBox<>();
        profileSelector.addItem("1.6.4");
        profileSelector.addItem("1.7.2");
        profileSelector.addItem("1.8.9");
        profileSelector.setBounds(60, 400, 160, 20);
    }

    private void addComponents() {
        add(playBtn);
        add(newProfileBtn);
        add(editProfileBtn);
        add(profileLbl);
        add(profileSelector);
    }
}
