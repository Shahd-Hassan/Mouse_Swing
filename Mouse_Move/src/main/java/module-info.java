module com.example.mouse_move {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.desktop;


    opens com.example.mouse_move to javafx.fxml;
    exports com.example.mouse_move;
}