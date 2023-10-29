package org.samples;

import com.spun.util.logger.SimpleLogger;
import org.approvaltests.Approvals;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LogMessageTest {

    @Test
    void outputMessage() {
        StringBuffer log = SimpleLogger.logToString();
        new LogMessage("Cannot connect to service", "warning").outputMessage();
        Approvals.verify(log);
    }
}