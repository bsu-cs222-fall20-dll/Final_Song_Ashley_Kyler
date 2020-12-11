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
    //This class is for setting
    //Report Issue function
    //connecting CheckReportInfo class

    public void start() {
        Stage reportStage = new Stage();
        GridPane reportGridPane = new GridPane();
        Label emailLabel = new Label("E-mail:");
        Label issueLabel = new Label("Issue:");
        TextField emailInput = new TextField();
        TextArea contentInput = new TextArea();
        Button buttonReport = new Button("Submit");
        Scene reportScene = new Scene(reportGridPane, 300, 300);

        reportStage.setTitle("Feedback");

        reportGridPane.setPadding(new Insets(10, 10, 10, 10));
        reportGridPane.setVgap(10);
        reportGridPane.setHgap(10);
        reportGridPane.getChildren().addAll(emailLabel, emailInput, issueLabel, contentInput, buttonReport);

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
            System.out.println(CheckReportInfo.isRightFormat(emailInput, contentInput));
            reportStage.close();
        });
    }

}
