package edu.bsu.cs222;

import java.util.ArrayList;

public class Player {
    Card card = new Card();
    private int playerNumofCards = 0;
    ArrayList playerHand = new ArrayList<>();

    public Player() {
            card.shuffle();
    }

    public void getOneCard(){
        playerHand.add(card.getOneCard(1));
        //getOneCard requires the number of the cards you need
        //I set it as one
        this.playerNumofCards++;
    }
    /*
    public int getHandSum() {

        int totalsum = 0;
        for (Card countsum : playerhand) {
            totalsum = totalsum +
        }
        return totalsum;
    }
    */
    public int getHandSum() {

        for (int i = 0; i < playerHand.size(); i++) {
            playerNumofCards++;
        }
        return playerNumofCards;
    }

    public void getPlayerHand(boolean hideCard){
        System.out.println("current hand");
        for ( int c = 0; c < playerNumofCards; c++);
        int c = 0;
        if (c == 0 && !hideCard){
            System.out.println("[Hidden Card]");
        } else {
            System.out.println(playerHand.get(c).toString());
        }
    }
}
