package org.removerecords;

import com.spun.util.logger.SimpleLogger;
import org.approvaltests.Approvals;
import org.junit.jupiter.api.Test;

class DeleteInactiveCustomersTest {
    @Test
    void findAndDeleteInactiveCustomers() {
        StringBuffer log = SimpleLogger.logToString();
        new DeleteInactiveCustomers().findAndDeleteInactiveCustomers(100);
        Approvals.verify(log);
    }
}