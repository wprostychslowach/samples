package no.ifitizm.report.types;

class ReportService {
    private final ReportGeneration reportGeneration;

    public ReportService(ReportGeneration reportGeneration) {
        this.reportGeneration = reportGeneration;
    }

    void generate(Report report) {
        System.out.println("Report generation started: "+report.getReportName());
        reportGeneration.generate(report);
        System.out.println("Report generation finished: "+report.getReportName());
        // here add code to send report
    }
}
