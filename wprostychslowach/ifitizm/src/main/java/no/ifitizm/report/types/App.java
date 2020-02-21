package no.ifitizm.report.types;

class App {
    public static void main(String[] args) {
        // Set manually report generation implementation
        ReportService csvReportService = new ReportService(new CsvGeneration());
        csvReportService.generate(new Report("some data", "MyCsvReport"));

        System.out.println();

        ReportService pdfReportService = new ReportService(new PdfGeneration());
        pdfReportService.generate(new Report("some data", "MyPdfReport"));

        // OR....

        // assume that user clicked chose a report format from a combobox and clicked 'generate' button. User's data came to e.g. rest controller
        new App().reportRestController(ReportType.Xls, "my report", "data");


    }

    // assume that there is a rest controller
    void reportRestController(ReportType reportType, String title, String data) {
        ReportGeneration reportGeneration = ReportGenerationFactory.of(reportType);
        ReportService reportService = new ReportService(reportGeneration);
        reportService.generate(new Report(data, title));
    }
}
