package edu.bsu.cs222;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

import javax.swing.*;//it need to be replaced by another window

public class ExitConfirmationDialog {
    private static boolean exitAnswer;

    public static boolean getExitAnswer(){
        Stage exitStage = new Stage();
        HBox exitWarningBox = new HBox();
        VBox buttonBox = new VBox();
        Label confirmation = new Label();
        Button buttonYes = new Button("Yes");
        Button buttonNo = new Button("No");
        Scene exitWarningScene = new Scene(exitWarningBox);

        confirmation.setText("Are you sure to exit?");

        buttonYes.setOnAction(actionEvent -> {
            exitAnswer = true;
            JOptionPane.showMessageDialog(null, "Thanks for your playing!");
            exitStage.close();
        });

        buttonBox.getChildren().addAll( buttonYes, buttonNo);
        buttonBox.setSpacing(30);
        buttonBox.setAlignment(Pos.CENTER);
        exitWarningBox.getChildren().addAll(confirmation, buttonBox);
        exitWarningBox.setSpacing(10);
        exitWarningBox.setAlignment(Pos.CENTER);

        exitStage.initModality(Modality.APPLICATION_MODAL);
        exitStage.setMinWidth(150);
        exitStage.setMinHeight(100);
        exitStage.setScene(exitWarningScene);
        exitStage.show();

        return exitAnswer;
    }
}
