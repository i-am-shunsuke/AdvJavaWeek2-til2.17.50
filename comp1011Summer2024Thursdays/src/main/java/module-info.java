module ca.georiancollege.comp1011summer2024thursdays {
    requires javafx.controls;
    requires javafx.fxml;


    opens ca.georiancollege.comp1011summer2024thursdays to javafx.fxml;
    exports ca.georiancollege.comp1011summer2024thursdays;
}