package DependencyInversion;

public class MongoDb implements Database{
    @Override
    public void saveToDB(String data) {
        System.out.println("data saved to mongodb");
    }
}
