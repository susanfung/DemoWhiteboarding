package org.samples;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

public class Restaurant {
    public Date getLastModified() {
        LocalDate currentDate = LocalDate.now();

        LocalDate oneYearAgo = currentDate.minusYears(1);

        Date oneYearAgoDate = Date.from(oneYearAgo.atStartOfDay(ZoneId.systemDefault()).toInstant());

        return oneYearAgoDate;
    }
}
