package no.ifitizm.report.types;

class PdfGeneration implements ReportGeneration {
    @Override
    public Object generate(Report report) {
        // use public api to create pdf report
        return report.getReportName()+".pdf";
    }
}
