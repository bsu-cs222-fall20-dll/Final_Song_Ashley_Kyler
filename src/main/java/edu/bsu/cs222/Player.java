package edu.bsu.cs222;

import java.util.ArrayList;

public class Player {
    Card card = new Card();
    static int numberOfPlayerWish = 1;
    static int numberOfComputerWish = 52;
    private int playerScore = 0;
    private int computerScore = 0;
    ArrayList <CardInitial> playerCards = new ArrayList <> ();
    ArrayList <CardInitial> computerCards = new ArrayList <> ();
    boolean playerLose = false;
    boolean computerLose = false;
    public boolean ComputerContinue = true;
    public boolean playerContinue = true;

    public Player() {
        card.shuffle();
    }

    public void userPlayerGetOneMore() {
        playerCards.add(card.getOneCard(numberOfPlayerWish));
        numberOfPlayerWish = numberOfPlayerWish+1;
        CardInitial cardInitial = playerCards.get(0);
        System.out.println("Now you have: ");
        cardInitial.displayNewCard();
        calculatePlayerScore();

        if(playerScore > 21) {
            playerLose = true;
        }
    }

    public void calculatePlayerScore() {
        playerScore = 0;

        for (CardInitial cardInitial : playerCards) {
            playerScore += cardInitial.point;
        }
    }

    public void calculateComputerScore() {
        computerScore = 0;

        for (CardInitial cardInitial : computerCards) {
            computerScore += cardInitial.point;
        }
    }

    public void getComputerPlayerChoice() {
        computerCards.add(card.getOneCard(numberOfComputerWish));
        numberOfComputerWish = numberOfComputerWish - 1;
        calculateComputerScore();

        if(!playerContinue) {
            ComputerContinue = false;
            System.out.println("Computer Stop");
            System.out.println();
        }else if(computerScore > 21) {
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
        for (Object computerCard : computerCards) {
            CardInitial cardInitial = (CardInitial) computerCard;
            cardInitial.displayNewCard();
        }

        System.out.println();

        System.out.println("Your cards: ");
        for (Object playerCard : playerCards) {
            CardInitial cardInitial = (CardInitial) playerCard;
            cardInitial.displayNewCard();
        }
    }


    public void computeAllScore() {
        this.calculatePlayerScore();
        this.calculateComputerScore();

        System.out.println();

        if(computerLose){
            System.out.println("Player Win");
        } else if(playerLose){
            System.out.println("Computer Win");
        } else if(playerScore > computerScore && playerScore < 21) {
            computerLose = true;
            System.out.println("Player Win");
        } else if(playerScore < computerScore && computerScore < 21) {
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
