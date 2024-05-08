package dev.frank_giger.dashdms.controllers;

import dev.frank_giger.dashdms.Container;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;

public class MainController extends BaseController {
    @FXML
    public Label containerStatusText;

    @FXML
    public Label applicationVersionText;

    @FXML
    public void openContainerAction(ActionEvent actionEvent) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Open container");
        fileChooser.getExtensionFilters().add(
                new FileChooser.ExtensionFilter("DDMS Files", "*.ddms")
        );
        File file = fileChooser.showOpenDialog(new Stage());

        if(file == null) {
            return;
        }

        boolean containerOpen = Container.openContainer(file.getPath());

        if(!containerOpen) {
            return;
        }

        // TODO: Do something here
    }

    public void newContainerAction(ActionEvent actionEvent) {

    }
}
