package with.dependency.inversion.controllers;

import with.dependency.inversion.reporting.ReportService;
import with.dependency.inversion.storage.ReportRepositoryImpl;

import java.util.Date;

class ReportController {
    public static void main(String[] args) {

        // ReportController is out entry point to program. Here you build dependencies tree with e.g. spring container, factory or just as below.
        ReportService reportService = new ReportService(new ReportRepositoryImpl());

        // assume it's a controller where you can pass request with date parameters 'from' and 'to'
        reportService.generateBy(new Date(), new Date());
    }
}
