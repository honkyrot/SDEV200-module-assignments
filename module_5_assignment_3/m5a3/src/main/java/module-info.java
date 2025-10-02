module com.m5a3 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.m5a3 to javafx.fxml;
    exports com.m5a3;
}
