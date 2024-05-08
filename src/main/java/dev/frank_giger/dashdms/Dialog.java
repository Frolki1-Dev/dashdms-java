package dev.frank_giger.dashdms;

import javax.swing.*;

public class Dialog {
    public static void showErrorDialog(String message) {
        showDialog("Something went wrong", message, JOptionPane.ERROR_MESSAGE);
    }

    public static void showErrorDialog(String message, String title) {
        showDialog(title, message, JOptionPane.ERROR_MESSAGE);
    }

    private static void showDialog(String title, String message, int button) {
        JOptionPane.showMessageDialog(null, message, title, button);
    }
}
