package edu.bsu.cs222;

import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class CheckReportInfo {
    public static boolean isRightFormat(TextField textEmailField, TextArea textContentArea) {
        String address = textEmailField.getText();
        String problem = textContentArea.getText();
        String addressSample = "\\w+[@]+[bsu]{3}\\.edu";

        boolean reportAnswer;
        if (address.matches(addressSample) && problem.equals("")) {
                System.out.println("Error: Nothing is reported.");
                reportAnswer = false;
            } else if(address.matches(addressSample) && problem != null) {
                System.out.println("Email is: " + address);
                reportAnswer = true;

        } else {
            System.out.println("Error: " + textEmailField.getText() + " is invalid.");
            reportAnswer = false;
        }
        return reportAnswer;
    }

}
