package no.ifitizm.report.types;

class XlsGeneration implements ReportGeneration {
    @Override
    public Object generate(Report report) {
        // use public api to create xls report
        return report.getReportName()+".xls";    }
}
