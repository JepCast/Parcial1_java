package parcial.parcial1_java;

import javafx.animation.Animation;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.util.Duration;
import java.io.IOException;
import java.net.URL;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.ResourceBundle;


public class HelloController implements Initializable {

    @FXML
    private Button salir;
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


    public AnchorPane scene1;
    @FXML
    public TextField inNameTexField;

    @FXML
    private Label AcceptButton;

    public void inNameText(ActionEvent OnEnter) {
        String nameuser = inNameTexField.getText();
        inNameTexField.setText("Bienvenido " + nameuser + "!");
    }

    @FXML
    private Label FeelingLabel = new Label();
    @FXML
    private Slider mySlider = new Slider();

    int feeling;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        mySlider.valueProperty().addListener(new ChangeListener<Number>() {
            @Override
            public void changed(ObservableValue<? extends Number> observableValue, Number number, Number t1) {
                feeling = (int) mySlider.getValue();
                FeelingLabel.setText(Integer.toString(feeling));
            }
        });
    }

    public Label clockLabel;

    private void updateClock() {
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");
        Date now = new Date();
        String time = sdf.format(now);
        clockLabel.setText(time);
    }

    public void Scene8(ActionEvent actionEvent) throws IOException {
        // Crear un Label para mostrar la hora actual
        clockLabel = new Label();
        clockLabel.setStyle("-fx-font-size: 24px;");

        // Actualizar la hora cada segundo utilizando un Timeline
        Timeline timeline = new Timeline(new KeyFrame(Duration.seconds(1), event -> updateClock()));
        timeline.setCycleCount(Animation.INDEFINITE);
        timeline.play();
    }

    public void exit(ActionEvent actionEvent) {
        // Crear el Alert de confirmación.
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Confirmar");
        alert.setHeaderText(null);
        alert.setContentText("¿Estás seguro de que quieres salir de la aplicación?");

        // Mostrar el Alert y esperar a que el usuario haga una elección.
        ButtonType result = alert.showAndWait().orElse(ButtonType.CANCEL);

        // Si el usuario hace clic en "Aceptar", cierra la aplicación.
        if (result == ButtonType.OK) {
            System.exit(0);
        }
    }


    public void Nuevo(ActionEvent actionEvent) {
        // Crear el Alert de confirmación.
        Alert alertnew = new Alert(Alert.AlertType.CONFIRMATION);
        alertnew.setTitle("Easter Egg");
        alertnew.setHeaderText(null);
        alertnew.setContentText("Las patatas aún siguen trabajando en esto ｡◕‿◕｡");

        // Mostrar el Alert y esperar a que el usuario haga una elección.
        ButtonType result = alertnew.showAndWait().orElse(ButtonType.CANCEL);

    }

    public void Abrir(ActionEvent actionEvent) {
        // Crear el Alert de confirmación.
        Alert alertopen = new Alert(Alert.AlertType.CONFIRMATION);
        alertopen.setTitle("Easter Egg");
        alertopen.setHeaderText(null);
        alertopen.setContentText("Las patatas aún siguen trabajando en esto ｡◕‿◕｡");

        // Mostrar el Alert y esperar a que el usuario haga una elección.
        ButtonType result = alertopen.showAndWait().orElse(ButtonType.CANCEL);

    }

    public void Guardar(ActionEvent actionEvent) {
        // Crear el Alert de confirmación.
        Alert alertsave = new Alert(Alert.AlertType.CONFIRMATION);
        alertsave.setTitle("Easter Egg");
        alertsave.setHeaderText(null);
        alertsave.setContentText("Las patatas aún siguen trabajando en esto ｡◕‿◕｡");

        // Mostrar el Alert y esperar a que el usuario haga una elección.
        ButtonType result = alertsave.showAndWait().orElse(ButtonType.CANCEL);
    }

    public void Salir(ActionEvent actionEvent) {
        // Crear el Alert de confirmación.
        Alert alertmenu = new Alert(Alert.AlertType.CONFIRMATION);
        alertmenu.setTitle("Confirmar");
        alertmenu.setHeaderText(null);
        alertmenu.setContentText("¿Estás seguro de que quieres salir de la aplicación?");

        // Mostrar el Alert y esperar a que el usuario haga una elección.
        ButtonType result = alertmenu.showAndWait().orElse(ButtonType.CANCEL);

        // Si el usuario hace clic en "Aceptar", cierra la aplicación.
        if (result == ButtonType.OK) {
            System.exit(0);
        }
    }
}