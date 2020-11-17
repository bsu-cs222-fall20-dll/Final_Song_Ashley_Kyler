package edu.bsu.cs222;

import java.util.Scanner;

public class Game{
    Scanner input = new Scanner(System.in);
    Player player = new Player();

    public void printMenu() {
        System.out.println("Welcome to the 21 game");
        System.out.println("Please select one of the two options below\n" +
                "1. Play\n"
                + "2. Instruction\n"
                + "3. Exit");
        makeChoice();
    }

    public void makeChoice(){
        String choice = input.nextLine();

        if (choice.equals("1")){
            playerContinue();
        }else if (choice.equals("2")){
            System.out.println("instruction");
            printMenu();
        }else if(choice.equals("3")){
            System.out.println("Exit");
            System.exit(0);
        }else{
            System.out.println();
            System.out.println("Error! Please enter a valid number.");
            System.out.println();
            printMenu();
        }
    }

    public void playerContinue(){
        player.userPlayerGetCards();
        player.getComputerPlayerChoice();

        if(player.ComputerContinue && player.playerLose == false) {
            player.getComputerPlayerChoice();
        }

        System.out.println();
        System.out.println("Would you like to continue?\n" + "yes or no");

        continueGame();
    }

    public void continueGame(){
        String playerContinueOrNot;
        playerContinueOrNot = input.nextLine();

        if(playerContinueOrNot.equals("yes")){
            player.userPlayerGetCards();
        }else {
            System.out.println();
            System.out.println("You decide not to continue.");

            while (player.ComputerContinue) {
                player.getComputerPlayerChoice();
            }

            if (player.playerLose == false && player.computerLose == false) {
                player.computeAllScore();
            }
        }
    }

}