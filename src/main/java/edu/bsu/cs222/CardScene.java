package edu.bsu.cs222;


import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
//import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

//import java.awt.*;


public class CardScene {
    //create for card image
    //it is divided from user interface
    //test
    //Game game = new Game();
    Player player = new Player();
    Button buttonAsk = new Button("Ask");
    Button buttonSuspend = new Button("Suspend");
    Button buttonRestart = new Button("Restart");
    Button buttonExit = new Button("Exit");
    GridPane cardGridPane = new GridPane();
    TextArea computerCardArea = new TextArea();
    TextArea playerCardArea = new TextArea();
    TextArea resultDisplayArea = new TextArea();
    HBox buttonBox = new HBox();
    Scene playScene = new Scene(cardGridPane, 400, 350);
    Stage gameStage = new Stage();
    public void start() {
        buttonAsk.setPrefSize(70,10);
        buttonSuspend.setPrefSize(70,10);
        buttonRestart.setPrefSize(70,10);
        buttonExit.setPrefSize(70,10);
        buttonBox.getChildren().addAll(buttonAsk, buttonSuspend, buttonRestart, buttonExit);
        buttonBox.setSpacing(38);
        buttonBox.setAlignment(Pos.CENTER);

        cardGridPane.setPadding(new Insets(10, 10, 10, 10));
        cardGridPane.setVgap(10);
        cardGridPane.setHgap(10);
        cardGridPane.getChildren().addAll(computerCardArea, playerCardArea, resultDisplayArea, buttonBox);
        GridPane.setConstraints(computerCardArea, 0, 0);
        GridPane.setConstraints(playerCardArea, 0, 1);
        GridPane.setConstraints(resultDisplayArea, 0, 2);
        GridPane.setConstraints(buttonBox, 0, 3);

        computerCardArea.setPrefRowCount(1);
        computerCardArea.setWrapText(true);
        computerCardArea.setPrefSize(300, 100);
        computerCardArea.setScrollLeft(1);

        playerCardArea.setPrefRowCount(1);
        playerCardArea.setWrapText(true);
        playerCardArea.setPrefSize(300, 100);
        computerCardArea.setScrollLeft(1);


        resultDisplayArea.setPrefRowCount(1);
        resultDisplayArea.setWrapText(true);
        resultDisplayArea.setPrefSize(300, 100);
        computerCardArea.setScrollLeft(1);

        gameStage.setScene(playScene);
        gameStage.show();

        buttonAsk.setOnAction(actionEvent -> {
            startGame();
            playerCardArea.setText(player.displayPlayerFirstCard());
        });
        buttonSuspend.setOnAction(actionEvent -> {
            suspendGame() ;
            showCards();
        });
        buttonRestart.setOnAction(actionEvent -> player.reGame());
        buttonExit.setOnAction(actionEvent -> {
            boolean exitAnswer = ExitConfirmationDialog.getExitAnswer();
            System.out.println(exitAnswer);
            if (exitAnswer){System.exit(0);}
        });
    }

    public void showCards(){
        computerCardArea.setText(player.displayComputerFinalCards());
        playerCardArea.setText(player.displayPlayerFinalCards());
        resultDisplayArea.setText(player.returnResult());
    }

    public void startGame(){
        if(player.ComputerContinue && !player.playerLose) {
            player.getComputerPlayerChoice();
        }
        player.userPlayerGetOneMore();
        player.getComputerPlayerChoice();
    }

    public void suspendGame() {
        player.playerContinue = false;
    }

}
