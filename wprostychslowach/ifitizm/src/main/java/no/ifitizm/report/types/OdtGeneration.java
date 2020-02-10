package no.ifitizm.report.types;

class OdtGeneration implements ReportGeneration {
    @Override
    public Object generate(Report report) {
        // use public api to create odt report
        return report.getReportName()+".odt";
    }
}
