package DesignPatterns.Factory;

public class Company {

    private Factory factory;

    public Company(Factory factory) {
        this.factory = factory;
    }

    public double generateSalary(String type) {
        Employee employee = factory.salaryFor(type);
        return employee.salary();
    }
}
