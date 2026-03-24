/**
 * Concept: Single Inheritance
 * One child class inherits from one parent class
 */

class AnimalSingle {
    void eat() {
        System.out.println("Animal eats food");
    }
}

class DogSingle extends AnimalSingle {
    void bark() {
        System.out.println("Dog barks");
    }
}

public class SingleInheritanceDemo {
    public static void main(String[] args) {
        DogSingle dog = new DogSingle();

        // Accessing parent method
        dog.eat();

        // Accessing child method
        dog.bark();
    }
}
