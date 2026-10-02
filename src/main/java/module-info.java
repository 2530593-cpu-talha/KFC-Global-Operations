module com.example.simulationofkfcoperation {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.simulationofkfcoperation to javafx.fxml;
    exports com.example.simulationofkfcoperation;
}