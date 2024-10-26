package com.mycompany.mypetselection;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class MyPetSelection {
    public static void main(String[] args)
    {
        SwingUtilities.invokeLater(MyPetSelection::createAndShowGUI);
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Pet Selection");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(250, 350);

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(0, 1));

        JRadioButton birdButton = new JRadioButton("Bird");
        JRadioButton catButton = new JRadioButton("Cat");
        JRadioButton dogButton = new JRadioButton("Dog");
        JRadioButton rabbitButton = new JRadioButton("Rabbit");
        JRadioButton pigButton = new JRadioButton("Pig");

        ButtonGroup petGroup = new ButtonGroup();
        petGroup.add(birdButton);
        petGroup.add(catButton);
        petGroup.add(dogButton);
        petGroup.add(rabbitButton);
        petGroup.add(pigButton);

        panel.add(birdButton);
        panel.add(catButton);
        panel.add(dogButton);
        panel.add(rabbitButton);
        panel.add(pigButton);
        JButton showPetButton = new JButton("Show Pet");
        showPetButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String selectedPet = "";
                if (birdButton.isSelected()) {
                    selectedPet = "Bird";
                } else if (catButton.isSelected()) {
                    selectedPet = "Cat";
                } else if (dogButton.isSelected()) {
                    selectedPet = "Dog";
                } else if (rabbitButton.isSelected()) {
                    selectedPet = "Rabbit";
                } else if (pigButton.isSelected()) {
                    selectedPet = "Pig";
                }
                JOptionPane.showMessageDialog(frame, "You selected: " + selectedPet);
            }
        });

        panel.add(showPetButton);

        frame.add(panel);
        frame.setVisible(true);
    }
}