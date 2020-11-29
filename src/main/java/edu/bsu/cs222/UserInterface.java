package edu.bsu.cs222;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class UserInterface extends Application {
    //CardPanel cardPanel = new CardPanel();
    //not sure how to finish the image work
    //we may divide it into two parts
    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage stage) {
        stage.setTitle("21 Game");

        Button buttonStart = new Button();
        Button buttonInstruction = new Button();
        Button buttonReportIssue = new Button();
        StackPane stackPaneStart = new StackPane();
        StackPane stackPaneInstruction = new StackPane();
        StackPane stackPaneReportIssue = new StackPane();
        VBox options = new VBox();
        Scene sceneMenu = new Scene(options);



        buttonStart.setText("Start");
        buttonInstruction.setText("Instruction");
        buttonReportIssue.setText("Report Issue");


        //menuPane.setCenter(options);
        options.getChildren().addAll(buttonStart, buttonInstruction, buttonReportIssue);
        options.setAlignment(Pos.CENTER);

        stage.setScene(sceneMenu);
        stage.show();
    }
}
