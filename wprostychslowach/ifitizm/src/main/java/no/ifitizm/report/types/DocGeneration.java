package no.ifitizm.report.types;

class DocGeneration implements ReportGeneration {
    @Override
    public Object generate(Report report) {
        // use public api to create doc report
        return report.getReportName()+".doc";    }
}
