module dk.easv.demo1 {
    requires javafx.controls;
    requires javafx.fxml;


    opens dk.easv.demo1 to javafx.fxml;
    exports dk.easv.demo1;
}