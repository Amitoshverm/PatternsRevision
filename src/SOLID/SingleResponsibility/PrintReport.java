package SOLID.SingleResponsibility;

public class PrintReport {

    public void print(Report report) {
        System.out.println("printing report with name :" + report.getReportName());
    }
}
