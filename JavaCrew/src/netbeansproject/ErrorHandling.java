/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * created by Muhammad Hanif Fadhil bin Zakaria (78245)
 * tested by Hana Saffiyya binti Ahmad Nozal (78013)
 */
package netbeansproject;


import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class ErrorHandling {
    private String name,year,month,day,amount;   //declarethe instance variale
   
    public boolean validateInputs(JTextField j1, JTextField j2, JTextField j3, JTextField j4, JTextField j5) {
    retrieveText(j1,j2,j3,j4,j5);
    //method that takes five jtext to be parameter

    // Perform validation checks for each input field
    if (name.isEmpty()) {
        showError("Error: Name of cannot be empty.");
        return false; // Validation failed
    } else if (!name.matches("^[a-zA-Z0-9 ]*(?=.*[a-zA-Z])[a-zA-Z0-9 ]+$")) {    //criteria needed 
        showError("Error: Name must be a letter or a combination of letter and number");
        return false; // Validation failed
    }

    if (year.isEmpty()) {
        showError("Error: Year cannot be empty.");
        return false; // Validation failed
    } else if (!year.matches("^[1-9][0-9]*$")) {
        showError("Error: Year must be an integer number and bigger than 0.");
        return false; // Validation failed
    }
    
    if (month.isEmpty()) {
        showError("Error: Month cannot be empty.");
        return false; // Validation failed
    } else if (!month.matches("^(1[0-2]|[1-9])$")) {
        showError("Error: Month must be between 1 and 12 (number accepted only)");
        return false; // Validation failed
    }

    if (day.isEmpty()) {
        showError("Error: Day cannot be empty.");
        return false; // Validation failed
    } else if (!day.matches("^(3[01]|[12][0-9]|[1-9])$")) {
        showError("Error: Day must be between 1 and 31 (number accepted only)");
        return false; // Validation failed
    }
    
    if (amount.isEmpty()) {
        showError("Error: Amount cannot be empty.");
        return false; // Validation failed
    } else if (!amount.matches("^[1-9][0-9]*$")) {
        showError("Error: Amount must be bigger than 0 (number accepted only)");
        return false; // Validation failed
    }
    // Continue validating other input fields
    // ...

    // If all inputs are valid
    return true;
}
    
    public void retrieveText(JTextField j1,JTextField j2,JTextField j3,JTextField j4,JTextField j5){
        name = j1.getText().trim();   //trim are used to remove white space avoid the error for space before , in the middle and after 
        year = j2.getText().trim();
        month = j3.getText().trim();
        day = j4.getText().trim();
        amount = j5.getText().trim();
    }
    public void showError(String errorMessage) {
    SwingUtilities.invokeLater(() -> {
        JOptionPane.showMessageDialog(null, errorMessage);  //this methd are used to ensure the thread safety
    });
}
}
