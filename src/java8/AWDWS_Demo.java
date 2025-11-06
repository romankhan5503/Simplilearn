package java8;

interface Vehicle {

    // Abstract method
    void start();

    // Default method
    default void fuelType() {
        System.out.println("Petrol");
    }

    // Static method
    static void service() {
        System.out.println("Service time: Every 6 months");
    }
}

class Car implements Vehicle {
    public void start() {
        System.out.println("Car Started");
    }
}

public class AWDWS_Demo {
    public static void main(String[] args) {
        Car c = new Car();

        c.start();        // abstract method (implemented in class)
        c.fuelType();     // default method (inherited from interface)
        Vehicle.service(); // static method (called using interface name)
    }
}
