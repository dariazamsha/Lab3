module pl.lublin.wsei.java.cwiczenia.lab3 {
    requires javafx.controls;
    requires javafx.fxml;



    exports pl.lublin.wsei.java.cwiczenia;
    opens pl.lublin.wsei.java.cwiczenia to javafx.fxml;
}