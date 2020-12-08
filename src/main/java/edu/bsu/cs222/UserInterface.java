package edu.bsu.cs222;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class UserInterface extends Application {


    public static void main(String[] args) { launch(args); }

    @Override
    public void start(Stage stage) {
        //CardPanel cardPanel = new CardPanel();
        //not sure how to finish the image work
        //we may divide it into two parts
        ReportPane reportPane = new ReportPane();
        CardScene cardScene = new CardScene();
        stage.setTitle("21 Game");

        Button buttonStart = new Button();
        Button buttonInstruction = new Button();
        Button buttonReportIssue = new Button();
        StackPane cardStackPane = new StackPane();
        StackPane instructionStackPane = new StackPane();
        VBox menuBox = new VBox();
        Scene menuScene = new Scene(menuBox, 300, 300);
        //Panel cardPanel = new Panel();

        buttonStart.setText("Start");
        buttonInstruction.setText("Instruction");
        buttonReportIssue.setText("Report Issue");

        cardStackPane.getChildren().add(buttonStart);
        instructionStackPane.getChildren().add(buttonInstruction);

        menuBox.getChildren().addAll(buttonStart, buttonInstruction, buttonReportIssue);
        menuBox.setSpacing(6);
        menuBox.setPadding(new Insets(150, 100, 30, 100));
        menuBox.setAlignment(Pos.CENTER);

        buttonInstruction.setOnAction(actionEvent -> {
                boolean answer = Instruction.display("21 Rule");
                System.out.println(answer);
        });
        buttonStart.setOnAction(actionEvent -> cardScene.start());
        buttonReportIssue.setOnAction(actionEvent -> reportPane.start());

        stage.setScene(menuScene);
        stage.show();
    }

}
