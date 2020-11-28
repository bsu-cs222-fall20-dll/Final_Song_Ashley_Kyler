package edu.bsu.cs222;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
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
        buttonStart.setText("Start");
        Button buttonInstruction = new Button();
        buttonInstruction.setText("Instruction");
        Button buttonReportIssue = new Button();
        buttonReportIssue.setText("Report Issue");

        Scene scene = new Scene(stackPane, 300, 300);
        stage.setScene(scene);
        stage.show();
    }
}
