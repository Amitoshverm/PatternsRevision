## 🧠 Singleton Design Pattern – Revision Notes

### 🔸 Definition:
Singleton pattern ensure karta hai ki ek class ka **sirf ek object hi create ho** aur uska **global access point** ho.
Like if we have shared resources like database or logger, we only create only one instance

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

## SpringBoot and Nestjs are the best examples of real world Singleton used 
Spring library internally use singleton design pattern where instances are created as singleton instances and we call them beans.  


## How to create singleton design pattern step-by-step
1. within the class hide the constructor (Constructor Hiding) 
2. Create a static object inside the class
3. Give global access to the static method

```java

public class Singleton {
    private static Singleton instance;   // Step 2
    private Singleton() {}               // Step 1

    public static Singleton getInstance() {  // Step 3
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
```

## Step	Kya kiya?	Kyu kiya?
1️⃣	private constructor  	Object ko bahar se banne se roka
2️⃣	static instance      	Sirf ek hi object memory me ho
3️⃣	static getInstance()    method	Wahi ek object baar-baar mile