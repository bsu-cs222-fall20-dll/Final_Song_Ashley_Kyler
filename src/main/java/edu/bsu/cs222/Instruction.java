package edu.bsu.cs222;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class Instruction {
    //This class is for
    //displaying game rule

    private static boolean answer;

    public static boolean display() {
        Stage instructionStage = new Stage();
        VBox instructionBox = new VBox();
        Label rule = new Label();
        Button buttonGotIt = new Button("Got it!");
        Scene instructionScene = new Scene(instructionBox);

        rule.setText(
                "   This card game is only between the computer and the player." + "\n" + "\n" +
                "   Points are counted by the number on their card, such as 2, 3, 4, etc." + "\n" +
                "For the face cards such as Jack, Queen and King, they are always worth  " + "\n" +
                "10 points. If your card is an Ace, you will get one point.              " + "\n" + "\n" +
                "   At the beginning of each round, you can see the cards that you get.  " + "\n" +
                "Then you can ask for a new card or suspend the round. " + "\n" +
                "The goal of each round is to get 21, or as close to 21 as you can get   " + "\n" +
                "without going over." + "\n" + "\n" +
                "   Your points will be calculated automatically." + "\n" + "\n" +
                "   If you or computer go over 21, the game will automatically terminate." + "\n" +
                "The player who goes over 21 will lose in that round. If both of you and " + "\n" +
                "computer go over 21, this round would become Invalid. If neither of you " + "\n" +
                "nor computer do not go over 21, the player who gets greater points      " + "\n" +
                "win this round.");

        buttonGotIt.setOnAction(actionEvent -> {
            answer = true;
            instructionStage.close();
        });

        instructionBox.getChildren().addAll(rule, buttonGotIt);
        instructionBox.setSpacing(10);
        instructionBox.setPadding(new Insets(10,5,5,5));
        instructionBox.setAlignment(Pos.CENTER);

        instructionStage.initModality(Modality.APPLICATION_MODAL);
        instructionStage.setTitle("21 Rules");
        instructionStage.setMinWidth(300);
        instructionStage.setScene(instructionScene);
        instructionStage.showAndWait();

        return answer;
    }

}
