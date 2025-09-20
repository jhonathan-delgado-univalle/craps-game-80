package com.example.crapsgame80.views;

import com.example.crapsgame80.controllers.GameController;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class GameView extends Stage {

    private GameController gameController;

    public GameView() throws IOException {
        this.setTitle("Craps Game");
        FXMLLoader fxmlLoader = new FXMLLoader(
                getClass().getResource("/com/example/crapsgame80/game-view.fxml")
        );
        Parent root = fxmlLoader.load();
        gameController = fxmlLoader.getController();
        Scene scene = new Scene(root);
        this.setScene(scene);
        this.getIcons().add(
                new Image(getClass().getResourceAsStream("/com/example/crapsgame80/images/favicon.png"))
        );
    }

    public GameController getGameController() {
        return gameController;
    }

    public static GameView getInstance() throws IOException {
        if (GameViewHolder.INSTANCE == null) {
            GameViewHolder.INSTANCE = new GameView();
        }
        return GameViewHolder.INSTANCE;
    }

    private static class GameViewHolder {
        private static GameView INSTANCE = null;
    }
}
