package com.oxology;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OGLauncher extends JFrame {
    private JButton playBtn;
    private JButton newProfileBtn;
    private JButton editProfileBtn;
    private JLabel profileLbl;
    private JComboBox<String> profileSelector;
    private ProfileEditor profileEditor;

    OGLauncher() {
        setTitle("Minecraft Launcher");
        setIconImage(new ImageIcon("minecraft.png").getImage());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        setBounds(100, 100, 800, 500);
        setResizable(false);

        setupComponents();
        addComponents();

        profileEditor = new ProfileEditor(this);

        setVisible(true);
    }

    private void setupComponents() {
        playBtn = new JButton();
        playBtn.setBounds(275, 400, 250, 50);
        playBtn.setText("Play");
        playBtn.setFocusable(false);

        newProfileBtn = new JButton();
        newProfileBtn.setBounds(10, 427, 103, 23);
        newProfileBtn.setText("New Profile");
        newProfileBtn.setFocusable(false);
        newProfileBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showProfileDialog();
            }
        });

        editProfileBtn = new JButton();
        editProfileBtn.setBounds(117, 427, 103, 23);
        editProfileBtn.setText("Edit Profile");
        editProfileBtn.setFocusable(false);
        editProfileBtn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                showProfileDialog();
            }
        });

        profileLbl = new JLabel();
        profileLbl.setText("Profile:");
        profileLbl.setBounds(10, 400, 50, 23);

        profileSelector = new JComboBox<>();
        profileSelector.addItem("1.6.4");
        profileSelector.addItem("1.7.2");
        profileSelector.addItem("1.8.9");
        profileSelector.setBounds(60, 400, 160, 23);
        profileSelector.setFocusable(false);
    }

    private void addComponents() {
        add(playBtn);
        add(newProfileBtn);
        add(editProfileBtn);
        add(profileLbl);
        add(profileSelector);
    }

    private void showProfileDialog() {
        profileEditor.setVisible(true);
    }
}
