package parcial.parcial1_java;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        Parent root= FXMLLoader.load(getClass().getResource("Scene1.fxml"));
        Scene scene = new Scene(root);

        Image icon = new Image("C:\\Universidad 1\\Java\\Parcial1_java\\src\\iconapp.jpeg"); // This is the icon of the window
        stage.getIcons().add(icon); //And this adds the icon to the window
        stage.setWidth(500); //This is the width of the window
        stage.setHeight(535); //This is the height of the window
        final String[] username = new String[1];



            TextField inNameTexField = new TextField();
            inNameTexField.setOnAction(e -> {

                username[0] = inNameTexField.getText();
            });

            Button AcceptButton = new Button("Aceptar");
            AcceptButton.setOnAction(e -> {
                username[0] = inNameTexField.getText();

            });
        stage.setScene(scene);
        stage.show();


    }
    public static void main(String[] args) {
        launch();
    }
}