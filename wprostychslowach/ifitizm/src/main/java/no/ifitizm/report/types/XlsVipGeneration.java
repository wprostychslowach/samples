package no.ifitizm.report.types;

class XlsVipGeneration implements ReportGeneration {
    @Override
    public Object generate(Report report) {
        // use public api to create xls vip report
        return report.getReportName()+".xlsx";
    }
}
