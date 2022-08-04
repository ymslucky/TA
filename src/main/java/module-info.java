module com.ymslucky.ta {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.kordamp.bootstrapfx.core;


    opens com.ymslucky.ta to javafx.fxml;
    exports com.ymslucky.ta;
}