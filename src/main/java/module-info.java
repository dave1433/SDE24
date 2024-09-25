module dk.davidcho.sde24 {
    requires javafx.controls;
    requires javafx.fxml;


    opens dk.davidcho.sde24 to javafx.fxml;
    exports dk.davidcho.sde24;
}