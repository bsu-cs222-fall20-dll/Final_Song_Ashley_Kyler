package edu.bsu.cs222;

public class Game {
    Player player = new Player();

    public void playerContinue(){
        if(player.ComputerContinue && !player.playerLose) {
            player.getComputerPlayerChoice();
        }
        continueGame();
    }

    public void continueGame() {
        if (player.ComputerContinue && !player.playerLose) {
            player.getComputerPlayerChoice();
        }
        player.userPlayerGetOneMore();
        player.getComputerPlayerChoice();
    }

    public void suspendGame() {
        player.playerContinue = false;
        player.computeAllScore();
    }
}