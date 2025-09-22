module lk.avin.demo1fx {
    requires javafx.controls;
    requires javafx.fxml;


    opens lk.avin.demo1fx to javafx.fxml;
    exports lk.avin.demo1fx;
    exports lk.avin.demo1fx.controller;
    opens lk.avin.demo1fx.controller to javafx.fxml;
}