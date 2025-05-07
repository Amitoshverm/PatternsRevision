package DesignPatterns.Singleton;

public class SingleTonClass {

    private static SingleTonClass instance;

    private SingleTonClass(){}

    public static SingleTonClass getInstance() {
        if (instance == null) {
            instance = new SingleTonClass();
        }
        return instance;
    }


}
