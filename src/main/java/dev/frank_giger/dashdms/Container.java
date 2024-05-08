package dev.frank_giger.dashdms;

import dev.frank_giger.dashdms.exceptions.NoContainerConnectionException;

import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Container {
    private static Connection connection;

    public static boolean openContainer(String path) {
        String uri = "jdbc:sqlite:" + path;

        try (Connection conn = DriverManager.getConnection(uri)){
            if(conn != null) {
                // Create the database first for us
                conn.getMetaData();
            }

            connection = conn;
            return true;
        } catch (SQLException e) {
            Dialog.showErrorDialog("An error occurred while opening the DDMS file.");
            return false;
        }
    }

    public static Connection getConnection() throws NoContainerConnectionException {
        if(connection == null) {
            throw new NoContainerConnectionException();
        }

        return connection;
    }
}
