package no.ifitizm.report.types;

class ReportGenerationFactory {
    static ReportGeneration of(ReportType reportType) {
        switch(reportType) {
            case Csv:
                return new CsvGeneration();
            case Xls:
                return new XlsGeneration();
            case Pdf:
                return new PdfGeneration();
            case Xml:
                return new XmlGeneration();
            default:
                return new XlsGeneration();
        }
    }
}
