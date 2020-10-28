package edu.bsu.cs222;

import java.util.ArrayList;

public class Player {
    private int playerNumofCards;
    ArrayList<CardInitial> playerhand;

    //
    public Player() {
        playerhand = new ArrayList<>();
    }
    public void getOneCard(Card aCard){
        playerhand.add(aCard);
        this.playerNumofCards++;
    }
    public int getHandSum() {
        int totalsum = 0;
        for (Card countsum : playerhand) {
            totalsum = totalsum +
        }
        return totalsum;
    }
        public void getPlayerHand(boolean hideCard){
            System.out.println("current hand");
            for ( int c = 0; c < playerNumofCards; c++);
            int c = 0;
            if (c == 0 && !hideCard){
                    System.out.println("[Hidden Card]");
                } else {
                    System.out.println(playerhand.get(c).toString());
                }


        }
    }

}
