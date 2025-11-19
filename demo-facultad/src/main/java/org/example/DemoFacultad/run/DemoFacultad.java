package org.example.DemoFacultad.run;

import org.openxava.util.AppServer;
import org.openxava.util.DBServer;

public class DemoFacultad {
    public static void main(String[] args) throws Exception {
        DBServer.start("DemoFacultad-db");
        AppServer.run("DemoFacultad");
    }
}
