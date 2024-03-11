module com.mycompany.test1st {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.test1st to javafx.fxml;
    exports com.mycompany.test1st;
}
