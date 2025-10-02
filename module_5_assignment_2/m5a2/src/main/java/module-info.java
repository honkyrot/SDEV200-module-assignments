module com.m5a2 {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.m5a2 to javafx.fxml;
    exports com.m5a2;
}
