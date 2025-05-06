package DependencyInversion;

public class Users {
    private Database db;

    public Users(Database db) {
        this.db = db;
    }

    void register(String file) {
        db.saveToDB(file);
    }
}
