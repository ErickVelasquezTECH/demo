module org.example.demo {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.security.jgss;


    opens org.example.demo to javafx.fxml;
    exports org.example.demo;
    exports org.example.login;
    opens org.example.login to javafx.fxml;
    exports org.example.tarea7;
    opens org.example.tarea7 to javafx.fxml;
}