/**
 * Demonstrates Partial Abstraction
 * Abstract class can have both abstract and concrete methods
 */

abstract class Vehicle {

    // Abstract method
    abstract void start();

    // Concrete method
    void fuelType() {
        System.out.println("Uses fuel");
    }
}

class Car extends Vehicle {

    @Override
    void start() {
        System.out.println("Car starts with key");
    }
}

public class VehicleDemo {
    public static void main(String[] args) {

        Vehicle v = new Car();

        v.start();      // abstract method implemented
        v.fuelType();  // concrete method inherited
    }
}