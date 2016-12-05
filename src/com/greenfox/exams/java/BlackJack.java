package com.greenfox.exams.java;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Zsuzsi on 2016. 12. 05..
 */
public class BlackJack extends JPanel {

    JLabel userPlayer = new JLabel();
    JLabel housePlayer = new JLabel();
    JButton drawCard = new JButton("Draw a com.greenfox.exams.java.Card");
    JButton reset = new JButton("New Game");
    Player user = new Player("User");
    Player house = new Player("House");

    public BlackJack() {
        userPlayer.setText(user.toString());
        housePlayer.setText(house.toString());

        drawCard.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });

        this.add(userPlayer);
        this.add(housePlayer);
        this.add(drawCard);
        this.add(reset);
    }


}
