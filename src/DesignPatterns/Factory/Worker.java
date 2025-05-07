package DesignPatterns.Factory;

public class Worker implements Employee{

    @Override
    public double salary() {
        System.out.println("salary for worker is ");
        return 10000;
    }
}
