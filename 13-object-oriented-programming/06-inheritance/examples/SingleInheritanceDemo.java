/**
 * Concept: Single Inheritance
 * One child class inherits from one parent class
 */

class Animal {
    void eat() {
        System.out.println("Animal eats food");
    }
}

class Dog extends Animal {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class SingleInheritanceDemo {
    public static void main(String[] args) {
        Dog dog = new Dog();

        // Accessing parent method
        dog.eat();

        // Accessing child method
        dog.bark();
    }
}
