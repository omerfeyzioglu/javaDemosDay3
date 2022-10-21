package core.logging;

import dataAccess.ILogger;

public class FileLogger implements ILogger {
    @Override
    public void log(String data) {
        System.out.println("logged to file : " + data);
    }
}
