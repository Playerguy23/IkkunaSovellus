package main;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage ikkuna) throws Exception {
        Button nappi = new Button("Nappi");
        Label teksti = new Label("Tekstielamentti");

        FlowPane komponenttiryhma = new FlowPane();
        komponenttiryhma.getChildren().add(nappi);
        komponenttiryhma.getChildren().add(teksti);

        Scene nakyma = new Scene(komponenttiryhma);

        ikkuna.setScene(nakyma);
        ikkuna.setTitle("Ikkuna");
        ikkuna.show();
    }

    public static void main(String[] args) {
        launch(args);
    }
}
