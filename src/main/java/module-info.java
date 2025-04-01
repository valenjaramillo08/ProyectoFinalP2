module co.edu.uniquindio.proyecto.proyecto {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens co.edu.uniquindio.proyecto.proyecto to javafx.fxml;
    exports co.edu.uniquindio.proyecto.proyecto;
}