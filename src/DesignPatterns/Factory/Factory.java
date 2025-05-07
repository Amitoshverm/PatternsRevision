package DesignPatterns.Factory;

public class Factory {

    Employee salaryFor(String employeeType) {
        if (employeeType.equals("Engineer")) {
            return new Engineer();
        }
        else if (employeeType.equals("Worker")) {
            return new Worker();
        }
        else if (employeeType.equals("Accountant")) {
            return new Accountant();
        }
        else {
            return null;
        }
    }
}
