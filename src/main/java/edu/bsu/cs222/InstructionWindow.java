package edu.bsu.cs222;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

class InstrucionWindow {
    private static boolean answer;

    public static boolean display(String title) {
        System.out.println("Rule Display");

        Stage stage = new Stage();
        VBox vBox = new VBox();
        Label label = new Label();
        Button buttonGotIt = new Button("Got it!");
        Scene scene = new Scene(vBox);

        String[] line = {
                "This card game is only between the computer and the player.\n",
                "\nPoints are counted by the number on their card, such as 2, 3, 4, etc.\n",
                "For the face cards such as jack, queen and king, they are always worth\n",
                "10 points. If your card is an ace, you will get one point.\n",
                "\nAt the beginning of each round, you can see the first card you get.\n",
                "The goal of each round is to get 21, or as close to 21 as you can get\n",
                "without going over.\n",
                "\nYour points will be calculated automatically.\n",
                "\nIf you or computer go over 21, the game will automatically terminate\n",
                "The player who goes over 21 will lose in that round. If both of you and\n",
                "computer go over 21, this round would become Invalid. If both of you and\n",
                "computer do not go over 21, the player who gets greater points win this\n",
                "round."};

        stage.initModality(Modality.APPLICATION_MODAL);
        stage.setTitle(title);
        stage.setMinWidth(300);

        label.setText(
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
                "\n\n\n\n"
        );

        buttonGotIt.setOnAction(actionEvent -> {
            answer = true;
            stage.close();
        });

        vBox.getChildren().addAll(label, buttonGotIt);
        vBox.setAlignment(Pos.CENTER);

        stage.setScene(scene);
        stage.showAndWait();

        return answer;
    }
}

