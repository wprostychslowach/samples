package no.ifitizm.report.types;

class CsvGeneration implements ReportGeneration {
    @Override
    public Object generate(Report report) {
        // use public api to create csv report
        return report.getReportName()+".csv";
    }
}
