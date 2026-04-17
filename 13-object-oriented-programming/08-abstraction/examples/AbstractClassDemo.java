/**
 * Demonstrates Abstract Class and Abstract Method
 */

// Abstract class (cannot be instantiated)
abstract class Animal {

    // Abstract method (no body)
    abstract void sound();

    // Concrete method (has implementation)
    void sleep() {
        System.out.println("Animal sleeps");
    }
}

// Child class must implement abstract method
class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class AbstractClassDemo {
    public static void main(String[] args) {

        // Cannot create object of abstract class
        // Animal a = new Animal();

        Animal a = new Dog();

        a.sound();  // implemented method
        a.sleep();  // inherited method
    }
}