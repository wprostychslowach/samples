package no.ifitizm.report.types;

class App {
    public static void main(String[] args) {
        ReportService csvReportService = new ReportService(new CsvGeneration());
        csvReportService.generate(new Report("some data", "MyCsvReport"));

        System.out.println();

        ReportService pdfReportService = new ReportService(new PdfGeneration());
        pdfReportService.generate(new Report("some data", "MyPdfReport"));
    }
}
