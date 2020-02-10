package no.ifitizm.report.types;

public class Report {
    private final String reportName;
    private final String reportData;

    public Report(final String reportData, String reportName) {
        this.reportData = reportData;
        this.reportName = reportName;
    }

    public String getReportName() {
        return reportName;
    }
}
