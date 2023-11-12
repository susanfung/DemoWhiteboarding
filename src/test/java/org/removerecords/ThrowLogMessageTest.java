package org.removerecords;

import com.spun.util.logger.SimpleLogger;
import org.approvaltests.Approvals;
import org.junit.jupiter.api.Test;

class ThrowLogMessageTest {

    @Test
    void outputMessage() {
        StringBuffer log = SimpleLogger.logToString();
        new ThrowLogMessage("Delete not successful", "warning").outputMessage();
        Approvals.verify(log);
    }
}