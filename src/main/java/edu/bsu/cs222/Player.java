package edu.bsu.cs222;

import java.awt.*;
import java.util.ArrayList;

public class Player {
    Card card = new Card();
    private int playerScore = 0;
    private int computerScore = 0;
    ArrayList playerCards = new ArrayList<>();
    ArrayList computerCards = new ArrayList();
    boolean playerLose = false;
    boolean computerLose = false;
    public boolean ComputerContinue = true;

    public Player() {
        card.shuffle();
    }

    public void userPlayerGetCards() {
        playerCards.add(card.getOneCard(1));
        CardInitial cardInitial = (CardInitial) playerCards.get(0);
        System.out.println("Now you have: ");
        cardInitial.displayNewCard();
        calculatePlayerScore();

        if(playerScore > 21) {
            playerLose = true;
        }
    }

    public void calculatePlayerScore() {
        playerScore = 0;

        for(int i = 0; i < playerCards.size(); i++) {
            CardInitial cardInitial = (card.getOneCard(1));
            playerScore += cardInitial.getPoint();
        }
    }

    public void calculateComputerScore() {
        computerScore = 0;

        for(int i = 0; i < computerCards.size(); i++) {
            CardInitial cardInitial = (card.getOneCard(1));
            computerScore += cardInitial.getPoint();
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
            System.out.println("Computer Stop");
            System.out.println();
        }
    }

    public void displayCard() {
        System.out.println("Computer's cards: ");
        for (int i = 0; i < computerCards.size(); i++) {
            CardInitial cardInitial = (CardInitial) computerCards.get(i);
            cardInitial.displayNewCard();
        }

        System.out.println();

        System.out.println("Your cards: ");
        for (int i = 0; i < playerCards.size(); i++) {
            CardInitial cardInitial = (CardInitial) playerCards.get(i);
            cardInitial.displayNewCard();
        }
    }


    public void computeAllScore() {
        calculatePlayerScore();
        calculateComputerScore();

        System.out.println();
        if(playerScore > computerScore) {
            computerLose = true;
            System.out.println("Player Win");
        } else if(playerScore < computerScore) {
            playerLose = true;
            System.out.println("Computer Win");
        } else {
            playerLose = true;
            System.out.println("Push");
        }

        System.out.println("Computer Score: " + computerScore
                + "\nPlayer Score: "+ playerScore);

        displayCard();
    }
}
