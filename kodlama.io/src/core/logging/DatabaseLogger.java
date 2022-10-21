package core.logging;

import dataAccess.ILogger;

public class DatabaseLogger implements ILogger {

    @Override
    public void log(String data) {
        System.out.println("logged to database : " + data);
    }
}
