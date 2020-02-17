package without.dependency.inversion.storage;

import without.dependency.inversion.reporting.Report;

import java.util.Date;

public class SQLReportRepository {

    public Report generateBy(Date from, Date to) {
        // sql statement generating report
        return new Report();
    }
}
