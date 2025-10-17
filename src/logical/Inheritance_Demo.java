package logical;

class Vehicle{
    void start() {
        System.out.println("Vehicle starts");
    }
}

class Car extends Vehicle {
    void fuel() {
        System.out.println("Car uses petrol");
    }
}

class ElectricCar extends Car {
    void battery() {
        System.out.println("Electric car uses battery");
    }
}

public class Inheritance_Demo {
    public static void main(String[] args) {
        ElectricCar e = new ElectricCar();
        e.start();
        e.fuel();
        e.battery();
    }
}
