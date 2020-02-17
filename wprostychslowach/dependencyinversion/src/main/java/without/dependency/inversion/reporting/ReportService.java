package without.dependency.inversion.reporting;

import without.dependency.inversion.storage.SQLReportRepository;

import java.util.Date;

/* reporting package is a core business module that should not depend on any external modules/libraries/frameworks to be as isolated as possible
   ReportService depends on SQLReportRepository that is an implementation of data access via e.g. jdbctemplate or orm. Any changes in SQLReportRepository
   can influences ReportService - not good.
*/
public class ReportService {
    private final SQLReportRepository sqlReportRepository = new SQLReportRepository();

    public Report generateBy(Date from, Date to) {
        return sqlReportRepository.generateBy(from, to);
    }
}
