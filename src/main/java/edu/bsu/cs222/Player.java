package edu.bsu.cs222;

//import javafx.geometry.Rectangle2D;
//import javafx.scene.image.Image;
//import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

import java.util.ArrayList;
//import java.util.List;

public class Player extends Pane {
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
        numberOfPlayerWish = numberOfPlayerWish + 1;
        calculatePlayerScore();

        if(playerScore > 21) {
            playerLose = true;
        }
    }

    public void getComputerPlayerChoice() {
        computerCards.add(card.getOneCard(numberOfComputerWish));
        numberOfComputerWish = numberOfComputerWish - 1;
        calculateComputerScore();

        if (!playerContinue) {
            ComputerContinue = false;
            System.out.println("Computer Stop");
            System.out.println();
        } else if (computerScore > 21) {
            computerLose = true;
            ComputerContinue = false;
        } else if (computerScore > 18) {
            ComputerContinue = false;
            System.out.println("Computer Stop");
            System.out.println();
        }
    }

    public void calculatePlayerScore () {
        playerScore = 0;
        for (CardInitial cardInitial : playerCards) {
            playerScore += cardInitial.point;
        }

    }

    public String displayPlayerScore() {
        calculatePlayerScore();
        String playerTotalScore;
        playerTotalScore = String.valueOf(playerScore);
        return playerTotalScore;
    }

    public void calculateComputerScore() {
        computerScore = 0;
        for (CardInitial cardInitial : computerCards) {
            computerScore += cardInitial.point;
        }
    }

    public String displayComputerScore() {
        calculateComputerScore();
        String computerTotalScore;
        computerTotalScore = String.valueOf(computerScore);
        return computerTotalScore;
    }

    public String displayComputerFinalCards() {
        StringBuilder computerFinalCards = new StringBuilder();

        for (CardInitial cardInitial : computerCards) {
            computerFinalCards.append(cardInitial.displayFinalCard());
        }

        return computerFinalCards.toString();
    }

    public String displayPlayerFinalCards() {
       StringBuilder playerFinalCards = new StringBuilder();

        for (CardInitial cardInitial : playerCards) {
            playerFinalCards.append(cardInitial.displayFinalCard());
        }

        return playerFinalCards.toString();
    }

    public String displayPlayerFirstCard() {
        userPlayerGetOneMore();
        String playerFirstCards = "";
        if (playerCards.size() > 0) {
            CardInitial cardInitial = playerCards.get(0);
            playerFirstCards = (cardInitial.displayFinalCard());
        }
        return playerFirstCards;
    }

    public String returnResult() {
        this.calculatePlayerScore();
        this.calculateComputerScore();

        if(computerLose && playerLose){
            return "Invalid";
        } else if(computerLose){
            return "Player Win\n"
                    +("Computer Score: " + computerScore
                    + "\nPlayer Score: "+ playerScore);
        } else if(playerLose){
            return "Computer Win\n"
                    +("Computer Score: " + computerScore
                    + "\nPlayer Score: "+ playerScore);
        } else if(playerScore > computerScore && playerScore <= 21) {
            computerLose = true;
            return "Player Win\n"
                    +("Computer Score: " + computerScore
                    + "\nPlayer Score: "+ playerScore);
        } else if(playerScore < computerScore && computerScore <= 21) {
            playerLose = true;
            return "Computer Win\n"
                    +("Computer Score: " + computerScore
                    + "\nPlayer Score: "+ playerScore);
        } else {
            playerLose = true;
            return "Push(Tie)\n"
                    +("Computer Score: " + displayComputerScore()
                    + "\nPlayer Score: "+ displayPlayerScore());
        }
    }

    public void reGame() {
        playerScore = 0;
        computerScore = 0;
        playerLose = false;
        computerLose = false;
        ComputerContinue = true;
        playerCards.clear();
        computerCards.clear();

        for(int i = 0; i < 2; i++) {
            calculatePlayerScore();
            calculateComputerScore();
            //repaint();
            //use for images
        }
    }

}
