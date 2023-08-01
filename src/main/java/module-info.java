module parcial.parcial1_java {
    requires javafx.controls;
    requires javafx.fxml;
            
                            
    opens parcial.parcial1_java to javafx.fxml;
    exports parcial.parcial1_java;
}