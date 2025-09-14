package com.example.crapsgame80.controllers;

import com.example.crapsgame80.models.AlertBox;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyEvent;


/**
 * This class control the Game GUI
 * @author Jhonathan Delgado
 * @version 1.0
 */
public class GameController {

    @FXML
    private Button playButton;

    /**
     * Represent the information area
     * @serial
     */
    @FXML
    private TextArea informationTextArea;

    /**
     * This method is a event handler for play button
     * @param event ActionEvent: represent the event
     * @see #showAlert
     */
    @FXML
    void onActionPlayButton(ActionEvent event) {
        String information = informationTextArea.getText();
        showAlert(information);
    }

    /**
     * Show AlerBox
     * @param information
     * @since 1.0
     */
    public void showAlert(String information) {
        AlertBox alertBox = new AlertBox();
        alertBox.showInformationAlert(
                "FPOE Gr.80",
                "Saludo",
                information
        );
    }

    @FXML
    void onKeyPressedInformationTextArea(KeyEvent event) {
        System.out.println(event.getCode());
        System.out.println(event.getSource());
        System.out.println(event.getTarget());
        System.out.println(event.getEventType());
        System.out.println(event.getCharacter());
    }

}
