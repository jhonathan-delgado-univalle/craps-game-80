package com.example.crapsgame80.controllers;

import com.example.crapsgame80.models.Player;
import com.example.crapsgame80.views.GameView;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class WelcomeController {

    @FXML
    private TextField nicknameTextField;

    @FXML
    void onActionStartButton(ActionEvent event) throws IOException {
        String nickname = nicknameTextField.getText();
        Player player = new Player();
        player.setNickname(nickname);
        GameView gameView = GameView.getInstance();
        gameView.getGameController().setPlayer(player);
        gameView.show();

        Node sourceNode = (Node)event.getSource();
        Scene scene = sourceNode.getScene();
        Stage stage = (Stage)scene.getWindow();
        stage.close();
    }

}
