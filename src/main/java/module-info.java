module com.example.gitproject002 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.gitproject002 to javafx.fxml;
    exports com.example.gitproject002;
}