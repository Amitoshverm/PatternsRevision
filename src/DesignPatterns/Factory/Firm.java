package DesignPatterns.Factory;

public class Firm {
    public static void main(String[] args) {
        Factory factory = new Factory();
        Employee engg = factory.salaryFor("Engineer");
        System.out.println(engg.salary());
    }
}
