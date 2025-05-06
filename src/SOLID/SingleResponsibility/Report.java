package SOLID.SingleResponsibility;

public class Report {

    private String reportName;
    public Report(String name) {
        this.reportName = name;
    }
    public String getReportName() {
        return reportName;
    }

    public void setReportName(String reportName) {
        this.reportName = reportName;
    }

    // These are the violation of the SRP
    public void generateReport(Report report) {
        System.out.println("generating report for: " + report.getReportName());
    }

    public void saveToFile(String fileName) {
        System.out.println("saving report to " + fileName);
    }
    public void printReport () {
        System.out.println(reportName);
    }
}
