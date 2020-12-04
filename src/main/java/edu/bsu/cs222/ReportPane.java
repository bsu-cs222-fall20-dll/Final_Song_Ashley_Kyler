package edu.bsu.cs222;

import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class ReportPane extends UserInterface {
    public void start() {
        Stage stage = new Stage();
        GridPane grid = new GridPane();
        Label emailLabel = new Label("E-mail:");
        Label issueLabel = new Label("Issue:");
        TextField emailInput = new TextField();
        TextField contentInput = new TextField();
        Button loginButton = new Button("Submit");
        Scene scene = new Scene(grid, 300, 300);

        stage.setTitle("Feedback");
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(10);
        grid.setHgap(10);
        grid.getChildren().addAll(emailLabel, emailInput, issueLabel, contentInput, loginButton);

        emailInput.setPromptText("   @gmail.com");
        contentInput.setPromptText("Please describe the problems that you meet");

        GridPane.setConstraints(emailLabel, 0, 0);
        GridPane.setConstraints(emailInput, 1, 0);
        GridPane.setConstraints(issueLabel, 0, 1);
        GridPane.setConstraints(contentInput, 1, 1);
        GridPane.setConstraints(loginButton, 1, 2);

        stage.setScene(scene);
        stage.show();
    }


}
