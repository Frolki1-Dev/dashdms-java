module dev.frank_giger.dashdms {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires java.desktop;


    opens dev.frank_giger.dashdms to javafx.fxml;
    exports dev.frank_giger.dashdms;
    exports dev.frank_giger.dashdms.applications;
    exports dev.frank_giger.dashdms.controllers;
    exports dev.frank_giger.dashdms.exceptions;
}