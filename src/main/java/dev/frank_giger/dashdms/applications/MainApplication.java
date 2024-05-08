package dev.frank_giger.dashdms.applications;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

/**
 * The MainController shows the main window of the application.
 */
public class MainApplication extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("main-window.fxml"));

        Scene scene = new Scene(fxmlLoader.load(), 900, 750);
        stage.setTitle("DashDMS");

        stage.getIcons().add(new Image(getClass().getResourceAsStream("favicon.jpg")));
        stage.setScene(scene);
        stage.show();
    }

    /**
     * The starting point of DashDMS.
     *
     * @param args Arguments which will be passed to the launch.
     */
    public static void main(String[] args) {
        launch(args);
    }
}
