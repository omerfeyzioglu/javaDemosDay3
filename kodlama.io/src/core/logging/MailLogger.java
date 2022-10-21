package core.logging;

import dataAccess.ILogger;

public class MailLogger implements ILogger {
    @Override
    public void log(String data) {
        System.out.println("logged to mail : " + data);
    }
}
