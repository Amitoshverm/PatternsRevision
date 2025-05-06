## 🧠 Singleton Design Pattern – Revision Notes

### 🔸 Definition:
Singleton pattern ensure karta hai ki ek class ka **sirf ek object hi create ho** aur uska **global access point** ho.

---

### ✅ Use-Cases:
- Logging (e.g., `Logger`)
- Database connections
- Application configuration
- Caching
- Resource pools

---

### 🔧 Key Points:
- **Constructor** ko `private` banate hain.
- Class ke andar ek `static` variable hota hai jo object ko hold karta hai.
- Ek `public static` method provide karte hain jisse same object return ho.

---

### 📦 Java Code:

```java
public class Logger {
    private static Logger instance; // single object

    private Logger() {
        System.out.println("Logger created!");
    }

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger(); // create if not already
        }
        return instance;
    }

    public void log(String msg) {
        System.out.println("Log: " + msg);
    }
}
```

#### 🔄 Usage:

```java
public class Main {
    public static void main(String[] args) {
        Logger log1 = Logger.getInstance();
        Logger log2 = Logger.getInstance();

        log1.log("First message");
        log2.log("Second message");

        System.out.println(log1 == log2); // true
    }
}
```

---

### ⚠️ Thread-Safety (Improved version):

```java
public class ThreadSafeLogger {
    private static final ThreadSafeLogger instance = new ThreadSafeLogger();

    private ThreadSafeLogger() {}

    public static ThreadSafeLogger getInstance() {
        return instance;
    }
}
```

---

### 📌 Summary Table:

| Feature         | Singleton Value                |
|-----------------|--------------------------------|
| Constructor     | Private                        |
| Access Method   | Public static (getInstance)    |
| Object Storage  | Static variable                |
| Reusability     | High (single instance reused)  |
| Thread Safety   | Optional (use synchronized or eager init) |

