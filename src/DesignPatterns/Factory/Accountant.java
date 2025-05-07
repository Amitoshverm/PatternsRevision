package DesignPatterns.Factory;

public class Accountant implements Employee{
    @Override
    public double salary() {
        System.out.println("salary for accountant is");
        return 500000;
    }
}
