module com.example.crapsgame80 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.crapsgame80 to javafx.fxml;
    opens com.example.crapsgame80.controllers to javafx.fxml;
    exports com.example.crapsgame80;
}