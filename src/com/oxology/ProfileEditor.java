package com.oxology;

import javax.swing.*;
import java.awt.*;

public class ProfileEditor extends JDialog {
    private JPanel main;

    private JPanel infoPanel;
    private JPanel versionPanel;
    private JPanel settingsPanel;

    private JLabel nameLabel;

    public ProfileEditor(JFrame frame) {
        super(frame, "Profile Editor");
        setIconImage(new ImageIcon("minecraft.png").getImage());
        setModal(true);
        setSize(600, 400);

        setupComponents();
        addComponents();
    }

    private void setupComponents() {
        main = new JPanel();
        main.setLayout(new BoxLayout(main, BoxLayout.Y_AXIS));

        infoPanel = new JPanel();
        infoPanel.setName("Profile Info");
        infoPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Profile Info"));
        infoPanel.setLayout(new BoxLayout(main, BoxLayout.Y_AXIS));

        nameLabel = new JLabel();
        nameLabel.setText("Profile:");
        nameLabel.setBounds(10, 10, 50, 23);

        infoPanel.add(nameLabel);
        main.add(infoPanel);

        versionPanel = new JPanel();
        versionPanel.setName("Version Selection");
        versionPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Version Selection"));

        main.add(versionPanel);

        settingsPanel = new JPanel();
        settingsPanel.setName("Java Settings (Advanced)");
        settingsPanel.setBorder(BorderFactory.createTitledBorder(BorderFactory.createEtchedBorder(), "Java Settings (Advanced)"));

        main.add(settingsPanel);
    }

    private void addComponents() {
        add(main);
    }
}
