/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ijse.sem1.hms.other;

import javax.swing.JTextField;

/**
 *
 * @author Achini & Samadhi
 */
public class Validation {

    public static void price(JTextField textField) {
        String text = textField.getText();
        if (!text.isEmpty()) {
            boolean res = text.matches("[0-9]+[.]?[0-9]{0,2}");
            if (!res) {
                textField.setText(text.substring(0, text.length() - 1));
            }
        }
    }

    public static void numberOnly(JTextField txtContact) {
        try {
            String s = txtContact.getText();
            while (!checkNumber(s)) {
                String s1 = s.substring(0, s.length() - 1);
                txtContact.setText(s1);
                s = s1;
            }
        } catch (Exception e) {
        }
    }
    
    public static boolean checkNumber(String s) {
        boolean isNumber = true;
        try {
            Long.parseLong(s);
            isNumber = true;
        } catch (Exception e) {
            isNumber = false;
        }
        return isNumber;
    }

}
