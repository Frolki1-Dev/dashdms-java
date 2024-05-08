package dev.frank_giger.dashdms;

import dev.frank_giger.dashdms.applications.MainApplication;

/**
 * For the build in the single jar we need a starting point here.
 * It will pass the start to the MainApplication of DashDMS.
 */
public class Launcher {
    public static void main(String[] args) {
        MainApplication.main(args);
    }
}
