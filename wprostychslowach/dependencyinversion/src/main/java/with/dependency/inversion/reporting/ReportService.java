package with.dependency.inversion.reporting;

import java.util.Date;

/* reporting package is a core business module that should not depend on any external modules/libraries/frameworks to be as isolated as possible
   ReportService depends on ReportRepository that is abstraction that belongs to domain (reporting package). In the entry point of the program (here: ReportController)
   dependencies are resolved. Changes in ReportRepositoryImpl (storage package) does not have any influence on domain (reporting package) source code.
*/
public class ReportService {
    private final ReportRepository reportRepository;


    public ReportService(ReportRepository reportRepository) {
        this.reportRepository = reportRepository;
    }

    public Report generateBy(Date from, Date to) {
        return reportRepository.generateBy(new MyPeriod(from, to));
    }
}
