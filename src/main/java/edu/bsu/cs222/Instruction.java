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
    private static boolean answer;

    public static boolean display(String title) {
        System.out.println("Rule Display");

        Stage stage = new Stage();
        VBox instructionBox = new VBox();
        Label rule = new Label();
        Button buttonGotIt = new Button("Got it!");
        Scene scene = new Scene(instructionBox);

        String[] line = {
                "   This card game is only between the computer and the player.", "\n", "\n",
                "   Points are counted by the number on their card, such as 2, 3, 4, etc.", "\n",
                "For the face cards such as jack, queen and king, they are always worth  ", "\n",
                "10 points. If your card is an ace, you will get one point.              ", "\n", "\n",
                "   At the beginning of each round, you can see the first card you get.  ", "\n",
                "The goal of each round is to get 21, or as close to 21 as you can get   ", "\n",
                "without going over.", "\n", "\n",
                "   Your points will be calculated automatically.", "\n", "\n",
                "   If you or computer go over 21, the game will automatically terminate.", "\n",
                "The player who goes over 21 will lose in that round. If both of you and ", "\n",
                "computer go over 21, this round would become Invalid. If neither of you ", "\n",
                "nor computer do not go over 21, the player who gets greater points      ", "\n",
                "win this round."};

        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setTitle(title);
        stage.setMinWidth(300);

        rule.setText(
                line[0]  +
                        line[1]  +
                        line[2]  +
                        line[3]  +
                        line[4]  +
                        line[5]  +
                        line[6]  +
                        line[7]  +
                        line[8]  +
                        line[9]  +
                        line[10] +
                        line[11] +
                        line[12] +
                        line[13] +
                        line[14] +
                        line[15] +
                        line[16] +
                        line[17] +
                        line[18] +
                        line[19] +
                        line[20] +
                        line[21] +
                        line[22] +
                        line[23] +
                        line[24] +
                        line[25] +
                        line[26] +
                        line[27] +
                        line[28]
        );

        buttonGotIt.setOnAction(actionEvent -> {
            answer = true;
            stage.close();
        });

        instructionBox.getChildren().addAll(rule, buttonGotIt);
        instructionBox.setSpacing(10);
        instructionBox.setPadding(new Insets(10,5,5,5));
        instructionBox.setAlignment(Pos.CENTER);

        stage.setScene(scene);
        stage.showAndWait();

        return answer;
    }
}
