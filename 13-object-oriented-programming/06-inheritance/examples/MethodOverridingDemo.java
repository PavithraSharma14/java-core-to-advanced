/**
 * Concept: Method Overriding
 * Child class provides specific implementation of parent method
 */

class Animal {
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class Dog extends Animal {

    // Overriding parent method
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class MethodOverridingDemo {
    public static void main(String[] args) {

        // Runtime polymorphism
        Animal obj = new Dog();
        obj.sound();
    }
}