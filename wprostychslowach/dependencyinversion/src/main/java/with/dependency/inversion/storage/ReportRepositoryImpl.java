package with.dependency.inversion.storage;

import with.dependency.inversion.reporting.MyPeriod;
import with.dependency.inversion.reporting.Report;
import with.dependency.inversion.reporting.ReportRepository;

public class ReportRepositoryImpl implements ReportRepository {
    @Override
    public Report generateBy(MyPeriod period) {
        // implementation. sql? another system? file? whatever. Changes in the implementation are invisible for domain ReportService.
        return new Report();
    }
}
