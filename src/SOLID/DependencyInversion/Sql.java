package SOLID.DependencyInversion;

public class Sql implements Database{
    @Override
    public void saveToDB(String data) {
        System.out.println("data saved to mysql");
    }
}
