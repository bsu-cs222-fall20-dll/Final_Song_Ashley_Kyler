package edu.bsu.cs222;


import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class CardScene {
    //create for card image
    //it is divided from user interface
    //test
    public void start() {
        //Game game = new Game();
        Button buttonAsk = new Button("Ask");
        Button buttonSuspend = new Button("Suspend");
        Button buttonRestart = new Button("Restart");
        Button buttonExit = new Button("Exit");
        HBox buttonBox = new HBox();
        Scene playScene = new Scene(buttonBox, 500, 530);
        Stage gameStage = new Stage();

        buttonAsk.setPrefSize(70,10);
        buttonSuspend.setPrefSize(70,10);
        buttonRestart.setPrefSize(70,10);
        buttonExit.setPrefSize(70,10);
        buttonBox.getChildren().addAll(buttonAsk, buttonSuspend, buttonRestart, buttonExit);
        buttonBox.setSpacing(38);
        buttonBox.setPadding(new Insets(470, 10, 5, 10));
        buttonBox.setAlignment(Pos.CENTER);

        gameStage.setScene(playScene);
        gameStage.show();
    }
}
