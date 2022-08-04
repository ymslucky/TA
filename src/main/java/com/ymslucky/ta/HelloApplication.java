package com.ymslucky.ta;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import org.kordamp.bootstrapfx.BootstrapFX;

import java.io.IOException;

public class HelloApplication extends Application {


    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("TA.fxml"));

        Button button = new Button("textextext");
        button.getStyleClass().add("btn");
        VBox vBox = new VBox(button);
        Scene scene = new Scene(vBox, 320, 240);

        scene.getStylesheets().add(BootstrapFX.bootstrapFXStylesheet());

        HelloController controller = fxmlLoader.getController();
        controller.init(stage, scene);

        Object load = fxmlLoader.load();

        stage.setTitle("Hello!");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}