package SOLID.InterfaceSegragation;

public interface User {

    // complete violation of ISP
    void placeOrder();
    void payOnline();
    void giveTip();
    void acceptOrder();
}
