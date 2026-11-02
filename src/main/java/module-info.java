module com.example.texteditorfx {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.texteditorfx to javafx.fxml;
    exports com.example.texteditorfx;
}