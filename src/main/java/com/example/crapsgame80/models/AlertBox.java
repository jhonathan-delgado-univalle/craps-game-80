package com.example.crapsgame80.models;

import javafx.scene.control.Alert;

public class AlertBox implements IAlertBox {

    /**
     * This method show a Alert information Dialog
     * @param title String: title of window
     * @param header String: subtitle
     * @param message String: content
     */
    @Override
    public void showInformationAlert(String title, String header, String message) {
        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle(title);
        alert.setHeaderText(header);
        alert.setContentText(message);
        alert.showAndWait();
    }

    @Override
    public void showWarningAlert(String title, String header, String message){
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle(title);
        alert.setHeaderText(header);
        alert.setContentText(message);
        alert.showAndWait();
    }
}
