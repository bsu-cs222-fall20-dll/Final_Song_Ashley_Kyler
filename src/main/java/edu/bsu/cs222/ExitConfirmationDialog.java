package edu.bsu.cs222;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

//import javax.swing.*;

public class ExitConfirmationDialog {
    private static boolean exitAnswer;

    public static boolean getExitAnswer(){
        Stage exitStage = new Stage();
        VBox exitWarningBox = new VBox();
        HBox buttonBox = new HBox();
        Label confirmation = new Label();
        Button buttonYes = new Button("Yes");
        Button buttonNo = new Button("No");
        Alert confirmationAlert = new Alert(Alert.AlertType.INFORMATION);
        Scene exitWarningScene = new Scene(exitWarningBox);

        confirmation.setText("Are you sure to exit?");

        confirmationAlert.setContentText("Thanks for playing!");

        buttonYes.setOnAction(actionEvent -> {
            exitAnswer = true;
            confirmationAlert.showAndWait();//Alert uses Chinese
            exitStage.close();
        });
        buttonNo.setOnAction(actionEvent -> {
            exitAnswer = false;
            exitStage.close();
        });

        buttonBox.getChildren().addAll( buttonYes, buttonNo);
        buttonBox.setSpacing(40);
        buttonBox.setAlignment(Pos.CENTER);
        exitWarningBox.getChildren().addAll(confirmation, buttonBox);
        exitWarningBox.setSpacing(10);
        exitWarningBox.setAlignment(Pos.CENTER);

        exitStage.initModality(Modality.APPLICATION_MODAL);
        exitStage.setMinWidth(250);
        exitStage.setMinHeight(150);
        exitStage.setScene(exitWarningScene);
        exitStage.showAndWait();

        return exitAnswer;
    }
}
