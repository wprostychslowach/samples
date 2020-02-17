package without.dependency.inversion.controllers;

import without.dependency.inversion.reporting.ReportService;

import java.util.Date;

class ReportController {
    public static void main(String[] args) {

        ReportService reportService = new ReportService();

        // assume it's a controller where you can pass request with date parameters 'from' and 'to'
        reportService.generateBy(new Date(), new Date());
    }
}
