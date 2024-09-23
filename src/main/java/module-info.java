module ham_radio_simp {
    requires javafx.controls;
    requires javafx.fxml;

    opens ham_radio_simp to javafx.fxml;
    exports ham_radio_simp;
}
