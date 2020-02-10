package no.ifitizm.report.types;

class XmlGeneration implements ReportGeneration {
    @Override
    public Object generate(Report report) {
        // use public api to create xml report
        return report.getReportName()+".xml";
    }
}
