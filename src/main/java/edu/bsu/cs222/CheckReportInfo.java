package edu.bsu.cs222;

import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

public class CheckReportInfo {
    //This class is for Report Issue
    // checking function

    public static String isRightFormat(TextField textEmailField, TextArea textContentArea) {
        String address = textEmailField.getText();
        String problem = textContentArea.getText();
        String addressSample = "\\w+[@]+[bsu]{3}\\.edu";

        if (address.matches(addressSample) && problem.equals("")) {
            return "Nothing is reported";
        } else if(address.matches(addressSample) && problem != null) {
            return "Email is: " + address + "\nThe problem is: " + problem;
        } else {
            return "The address " + address + " is invalid.";
        }
    }

}
