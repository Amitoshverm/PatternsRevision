package DesignPatterns.Factory;

public class Engineer implements Employee{
    @Override
    public double salary() {
        System.out.println("salary for engineer is ");
        return 1200000;
    }
}
