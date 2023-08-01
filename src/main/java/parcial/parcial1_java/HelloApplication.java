package parcial.parcial1_java;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 320, 240);

        Image icon = new Image("C:\\Universidad 1\\Java\\Parcial1_java\\src\\iconapp.jpeg"); // This is the icon of the window
        stage.getIcons().add(icon); //And this adds the icon to the window
        stage.setTitle("Minecraft Dream"); //This is the title of the window



        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}