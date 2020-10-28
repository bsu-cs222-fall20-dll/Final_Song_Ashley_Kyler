package edu.bsu.cs222;

import java.util.ArrayList;

public class Player {
    Card card = new Card();
    private int playerNumofCards = 0;
    private int computerScore = 0;
    ArrayList playerHand = new ArrayList<>();
    ArrayList computerCards = new ArrayList();
    private boolean playerLose = false;
    private boolean computerLose = false;
    public boolean ComputerContinue = true;

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

    //The following part is about computer
    public void calculateComputerScore() {
        computerScore = 0;
        for(int i = 0; i < computerCards.size(); i++) {
            CardInitial cardInitial = (CardInitial) computerCards.get(i);
            computerScore += cardInitial.point;
        }
    }

    public void getComputerPlayerChoice() {
        computerCards.add(card.getOneCard(1));
        calculateComputerScore();

        if(computerScore > 21) {
            computerLose = true;
            ComputerContinue = false;
        }else if(computerScore > 18){
            ComputerContinue = false;
            System.out.println("Computer Quit");
        }
    }


    public void computeAllScore() {
        this.calculatePlayerScore();
        this.calculateComputerScore();

        if(playerScore > computerScore) {
            computerLose = true;
            System.out.println("Player Win");
        }
        else if(playerScore < computerScore) {
            playerLose = true;
            System.out.println("Computer Win");
        }
        else {
            playerLose = true;
            System.out.println("Play Even");
        }
        System.out.println("Computer Score: " + computerScore
                + "\nPlayer Score: "+ playerScore);
    }
}
