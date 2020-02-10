package ifitizm.report.types;

// it's ugly
class ReportService {
    private Object report;

    Object generate(ReportType reportType, String reportData) {
        if(ReportType.Pdf == reportType) {
            report = generateXls(reportData);
        } else if(ReportType.Doc == reportType) {
            report = generateDoc(reportData);
        } else if(ReportType.Xml == reportType) {
            report = generateXml(reportData);
        } else if(ReportType.Xls == reportType) {
            report = generateXls(reportData);
        } else if(ReportType.Csv == reportType) {
            report = generateCsv(reportData);
        } else if(ReportType.Odt == reportType) {
            report = generateOdt(reportData);
        }
        // oh. can be null! ugly code.
        return report;
    }

    static Object generateXls(String reportData) {
        // use library api to generate xls
        return null;
    }

    static Object generateXlsVip(String reportData) {
        // use library api to generate colorful xls
        return null;
    }

    static Object generateCsv(String reportData) {
        // use library api to generate csv
        return null;
    }

    static Object generateDoc(String reportData) {
        // use library api to generate doc
        return null;
    }

    static Object generateXml(String reportData) {
        // use library api to generate xml
        return null;
    }

    static Object generateOdt(String reportData) {
        // use library api to generate odt
        return null;
    }
}
