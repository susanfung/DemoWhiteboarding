package org.samples;

import com.spun.util.logger.SimpleLogger;

public class LogMessage {
    private final String message;
    private final String level;

    public LogMessage(String message, String level) {
        this.message = message;
        this.level = level;
    }

    public String getMessage() {
        return message;
    }

    public String getLevel() {
        return level;
    }

    public void outputMessage() {
        SimpleLogger.event(message);
    }
}
