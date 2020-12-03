package edu.bsu.cs222;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class UserInterface extends Application {

    @Override
    public void start(Stage stage) {
        //CardPanel cardPanel = new CardPanel();
        //not sure how to finish the image work
        //we may divide it into two parts
        stage.setTitle("21 Game");

        Button buttonStart = new Button();
        Button buttonInstruction = new Button();
        Button buttonReportIssue = new Button();
        VBox menuBox = new VBox();
        Scene sceneMenu = new Scene(menuBox, 300, 300);

        buttonStart.setText("Start");
        buttonInstruction.setText("Instruction");
        buttonReportIssue.setText("Report Issue");

        menuBox.getChildren().addAll(buttonStart, buttonInstruction, buttonReportIssue);
        stage.setScene(sceneMenu);
        stage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
