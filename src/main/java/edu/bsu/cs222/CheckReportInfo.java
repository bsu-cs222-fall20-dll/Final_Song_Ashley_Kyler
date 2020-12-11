package edu.bsu.cs222;

import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.io.Serializable;

public class CheckReportInfo {
    public static String isRightFormat(TextField textEmailField, TextArea textContentArea) {
        String address = textEmailField.getText();
        String problem = textContentArea.getText();
        String addressSample = "\\w+[@]+[bsu]{3}\\.edu";

        boolean reportAnswer;
        if (address.matches(addressSample) && problem.equals("")) {
                //System.out.println("Nothing is reported.");
            return "Nothing is reported";
        } else if(address.matches(addressSample) && problem != null) {
                //System.out.println("Email is: " + address);
            // System.out.println("The problem is: " + problem);
            return "Email is: " + address + "\nThe problem is: " + problem;
        } else {
            //System.out.println("The address " + address + " is invalid.");
            return "The address " + address + " is invalid.";
        }
    }

}
