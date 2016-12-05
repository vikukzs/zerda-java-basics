package com.greenfox.exams.java;

import java.util.ArrayList;

/**
 * Created by Zsuzsi on 2016. 12. 05..
 */
public class Player extends Card {
    String name;
    ArrayList<Card> played = new ArrayList<>();

    public Player(String name) {

        this.name = name;
    }

    public void sum() {

    }

    public void add() {
        if (isPlayed()) {

        }
    }

    @Override
    public String toString() {
        return name + " played: " + played.toString();
    }
}
