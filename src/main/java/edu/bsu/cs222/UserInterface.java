package edu.bsu.cs222;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
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
        Scene sceneStart = new Scene(stackPaneStart, 300, 300);
        Scene sceneInstruction = new Scene(stackPaneInstruction, 300, 300);
        Scene sceneReportIssue = new Scene(stackPaneReportIssue, 300, 300);

        buttonStart.setText("Start");
        buttonInstruction.setText("Instruction");
        buttonReportIssue.setText("Report Issue");

        stackPaneStart.getChildren().add(buttonStart);
        stackPaneInstruction.getChildren().add(buttonInstruction);
        stackPaneReportIssue.getChildren().add(buttonReportIssue);

        stage.setScene(sceneStart);
        stage.setScene(sceneInstruction);
        stage.setScene(sceneReportIssue);
        stage.show();
    }
}
