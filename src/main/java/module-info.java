module dev.frank_giger.dashdms.dashdms {
    requires javafx.controls;
    requires javafx.fxml;


    opens dev.frank_giger.dashdms.dashdms to javafx.fxml;
    exports dev.frank_giger.dashdms.dashdms;
}