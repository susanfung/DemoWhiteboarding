package org.samples;

import com.spun.util.logger.SimpleLogger;
import org.approvaltests.Approvals;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeleteInactiveCustomersTest {
    @Test
    void findAndDeleteInactiveCustomers() {
        StringBuffer log = SimpleLogger.logToString();
        new DeleteInactiveCustomers().findAndDeleteInactiveCustomers(100);
        Approvals.verify(log);
    }
}