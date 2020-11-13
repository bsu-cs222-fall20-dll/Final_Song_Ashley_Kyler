package edu.bsu.cs222;

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
        }
    }

    public void displayCard(){
        for (int i = 0; i <= computerCards.size(); i++) {
            System.out.println("Computer's cards: " + computerCards.get(i));
        }
        for (int i = 0; i <= playerCards.size(); i++) {
            System.out.println("Your cards: " + playerCards.get(i));
        }
    }


    public void computeAllScore() {
        calculatePlayerScore();
        calculateComputerScore();

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

        /*for(int i = 0; i < computerCards.size(); i++) {
            displayCard();
            CardInitial cardInitial = (CardInitial) computerCards.get(i);
            computerScore += cardInitial.point;
        }*/
    }
}
