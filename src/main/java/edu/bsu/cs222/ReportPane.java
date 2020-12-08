package edu.bsu.cs222;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ReportPane {
    public void start() {
        Stage reportStage = new Stage();
        GridPane gridPane = new GridPane();
        Label emailLabel = new Label("E-mail:");
        Label issueLabel = new Label("Issue:");
        TextField emailInput = new TextField();
        TextArea contentInput = new TextArea();
        Button buttonReport = new Button("Submit");
        Scene reportScene = new Scene(gridPane, 300, 300);

        reportStage.setTitle("Feedback");

        gridPane.setPadding(new Insets(10, 10, 10, 10));
        gridPane.setVgap(10);
        gridPane.setHgap(10);
        gridPane.getChildren().addAll(emailLabel, emailInput, issueLabel, contentInput, buttonReport);

        emailInput.setPromptText("   @gmail.com");
        contentInput.setPromptText("Please describe the problems that you meet");
        contentInput.setPrefRowCount(1);
        contentInput.setWrapText(true);
        contentInput.setPrefSize(200, 100);
        contentInput.setScrollLeft(1);



        GridPane.setConstraints(emailLabel, 0, 0);
        GridPane.setConstraints(emailInput, 1, 0);
        GridPane.setConstraints(issueLabel, 0, 1);
        GridPane.setConstraints(contentInput, 1, 1);
        GridPane.setConstraints(buttonReport, 1, 2);

        reportStage.setScene(reportScene);
        reportStage.show();

        buttonReport.setOnAction(actionEvent -> {
            boolean reportAnswer = CheckReportInfo.isRightFormat(emailInput, contentInput);
            System.out.println(reportAnswer);
            reportStage.close();
        });
    }

}
