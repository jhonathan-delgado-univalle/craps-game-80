package com.example.crapsgame80;

import com.example.crapsgame80.models.AlertBox;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        /*
        stage.setTitle("Craps Game");
        HBox root = new HBox();
        Text crapsText = new Text("Craps");
        Button crapsButton = new Button("Inicio");

        crapsButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                AlertBox alertBox = new AlertBox();
                alertBox.showInformationAlert(
                        "FPOE Gr80",
                        "Saludo",
                        "Hola estudiantes de la tarde!"
                );
            }
        });

        root.getChildren().add(crapsButton);
        root.getChildren().add(crapsText);
        Scene scene = new Scene(root, 400, 300);
        stage.setScene(scene);
        stage.show();
        */


        stage.setTitle("Craps Game");
        FXMLLoader fxmlLoader = new FXMLLoader(
                getClass().getResource("/com/example/crapsgame80/game-view.fxml")
        );
        Parent root = fxmlLoader.load();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();

    }

    public static void main(String[] args) {
        launch(args);

        // Comentario simple
        /*
        Comentario multiples lineas
        */
        /*
        byte a = 127;
        short b = 32767;
        int c = 2000000000;
        long d = 12345678912345L;

        float e = 3.1416f;
        double f = 3.14159265358979323846;

        double g = Double.POSITIVE_INFINITY;
        double h = Double.NEGATIVE_INFINITY;
        double i = Double.NaN;

        double suma = a + f;
        int resta = a - b;
        int prod = a * b;
        int div = a / b;
        int res = a % b;

        char j = 'a';
        String k = "Hello World!";

        boolean l = true;
        boolean m = false;

        boolean n = a < b; // < > <= >= == !=

        if (a < b) {
            // algo
        } else if (a < b) {
            // algo
        } else {
            if (a < b) {
                // algo
            } else {
                // algo 2
            }
        }

        int condicionSwitch = 2;
        switch (condicionSwitch) {
            case 1:
                System.out.println("Caso 1");
                break;
            case 2:
                System.out.println("Caso 2");
                break;
            case 3:
                System.out.println("Caso 3");
                break;
            default:
                System.out.println("Caso Default");
                break;
        }

        int acum = 0;
        while (acum < 5) {
            System.out.println(acum);
            acum = acum + 1;
            acum += 1;
            acum++;
        }

        acum = 0;
        do {
            System.out.println(acum);
            acum++;
        } while (acum < 5);

        for (int x=0 ; x<5 ; x++) {
            System.out.println(x);
        }

        System.out.println("Suma:" + suma(4,5));
        */
    }

    private static int suma(int a, int b) {
        return a + b;
    }
}