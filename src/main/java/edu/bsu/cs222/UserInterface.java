package edu.bsu.cs222;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class UserInterface extends Application {


    public static void main(String[] args) { launch(args); }

    @Override
    public void start(Stage primaryStage) {
        //CardPanel cardPanel = new CardPanel();
        //not sure how to finish the image work
        //we may divide it into two parts
        ReportPane reportPane = new ReportPane();
        CardScene cardScene = new CardScene();
        Label welcomeLabel = new Label();
        Button buttonStart = new Button();
        Button buttonInstruction = new Button();
        Button buttonReportIssue = new Button();
        StackPane cardStackPane = new StackPane();
        StackPane instructionStackPane = new StackPane();
        VBox menuBox = new VBox();
        Scene menuScene = new Scene(menuBox, 300, 300);
        //Panel cardPanel = new Panel();

        welcomeLabel.setText("Welcome to the 21 game");

        buttonStart.setText("Start");
        buttonInstruction.setText("Instruction");
        buttonReportIssue.setText("Report Issue");
        buttonInstruction.setOnAction(actionEvent -> {
            System.out.println("Rule Display");
            boolean answer = Instruction.display();
            System.out.println(answer);
        });
        buttonStart.setOnAction(actionEvent -> cardScene.start());
        buttonReportIssue.setOnAction(actionEvent -> reportPane.start());

        cardStackPane.getChildren().add(buttonStart);
        instructionStackPane.getChildren().add(buttonInstruction);

        menuBox.getChildren().addAll(buttonStart, buttonInstruction, buttonReportIssue);
        menuBox.setSpacing(6);
        menuBox.setPadding(new Insets(150, 100, 30, 100));
        menuBox.setAlignment(Pos.CENTER);

        primaryStage.setTitle("21 Game");
        primaryStage.setScene(menuScene);
        primaryStage.show();
    }

}
