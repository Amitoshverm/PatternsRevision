package OOPS;

public class Child extends Parent{
    Child() {
        super("hello");
        System.out.println("Child Constructor");
    }

    public static void main(String[] args) {
        Child child = new Child();
    }
}
