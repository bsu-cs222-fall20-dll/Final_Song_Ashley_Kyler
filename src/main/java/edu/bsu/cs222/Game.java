package edu.bsu.cs222;

import java.util.Scanner;

public class Game{
    Scanner input = new Scanner(System.in);
    Player player = new Player();

    public void printMenu() {
        System.out.println("Welcome to the 21 game");
        System.out.println("Please select one of the three options below\n" +
                "1. Play\n"
                + "2. Instruction\n"
                + "3. Exit");
        makeChoice();
    }

    public void makeChoice(){
        String choice = input.nextLine();

        switch (choice) {
            case "1":
                playerContinue();
                break;
            case "2":
                System.out.print("Blackjack instructions\n"
                        + "This card game is only between the computer and the player.\n"
                        + "Cards are counted by the number on their card, such as 2, 3, 4, etc."
                        + "count as that number. For the face cards such as jack, queen,"
                        + "and king they are always worth 10. Finally, if you are dealt an ace,"
                        + "when the total is bigger than 21, then ace is 1, if not ace is 11.\n"
                        + "2 cards will be dealt at the beginning of each round. Both being face up "
                        + "so you can see what you have.\n"
                        + "The goal of each round is to get 21, or as close to 21 you can get"
                        + "without going over. Because, if you go over 21 you automatically lose that round.\n"
                        + "if you want a card, then the system can issue a card to the player. "
                        + "If the total number of points after the card exceeds 21,"
                        + "it will be counted as a burst, and the player will lose this round of the game;"
                        + "If the number of points after the card is 21 points, you can not want to;"
                        + "If the total number of points is less than 21, the player can continue to "
                        + "\"ask\" and  \"suspend\" . \n");
                System.out.println();
                printMenu();
                break;
            case "3":
                System.out.println("Exit");
                System.exit(0);
            default:
                System.out.println();
                System.out.println("Error! Please enter a valid number.");
                System.out.println();
                printMenu();
                break;
        }
    }

    public void playerContinue(){
        if(player.ComputerContinue && !player.playerLose) {
            player.getComputerPlayerChoice();
        }

        System.out.println();
        System.out.println("Ask or Suspend? (A or S)");

        continueGame();
    }

    public void continueGame(){
        String playerContinueOrNot;
        playerContinueOrNot = input.nextLine();

        if(playerContinueOrNot.equals("A" )|| playerContinueOrNot.equals("Ask")){
            player.userPlayerGetOneMore();
            playerContinue();

            while (player.ComputerContinue) {
                player.getComputerPlayerChoice();
            }
        }else if(playerContinueOrNot.equals("S") || playerContinueOrNot.equals("Suspend")){
            player.playerContinue = false;

            System.out.println();
            System.out.println("You decide not to continue.");

            player.computeAllScore();

            System.exit(0);
        }else{
            System.out.println("Please enter a valid answer.");
        }
    }

}