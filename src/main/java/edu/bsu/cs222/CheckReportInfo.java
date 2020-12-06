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
                System.out.println("Nothing is reported.");
                reportAnswer = false;
            } else if(address.matches(addressSample) && problem != null) {
                System.out.println("Email is: " + address);
                System.out.println("The problem is: " + problem);
                reportAnswer = true;
        } else {
            System.out.println("The address " + address + " is invalid.");
            reportAnswer = false;
        }
        //System.out.println("test");
        return reportAnswer;

    }

}
