package parcial.parcial1_java;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;


public class HelloController {

    public Button AcceptButton1;
    private Stage stage;
    private Scene scene;
    private Parent root;

    public void switchToScene1(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Scene1.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToScene2(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Scene2.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    public void switchToScene3(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Scene3.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToScene4(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Scene4.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToScene5(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Scene5.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToScene6(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Scene6.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToScene7(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Scene7.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToScene8(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Scene8.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToScene9(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Scene9.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }
    public void switchToScene10(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(getClass().getResource("Scene10.fxml"));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }




    public AnchorPane scene1;
    @FXML
    public TextField inNameTexField;

    @FXML
    private Label AcceptButton;

    @FXML
    public void AcceptButton1(ActionEvent OnAction) {
        String nameuser = inNameTexField.getText();
        AcceptButton.setText("Tu nombre ha sido guardado!");
    }

    public void inNameText(ActionEvent OnEnter) {
        String nameuser = inNameTexField.getText();
        inNameTexField.setText("Bienvenido " + nameuser + "!");
    }
}