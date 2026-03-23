/**
 * Concept: Hierarchical Inheritance
 * Multiple child classes inherit from one parent class
 */

class Animals {
    void eat() {
        System.out.println("Animal eats");
    }
}

class Dogs extends Animals {
    void bark() {
        System.out.println("Dog barks");
    }
}

class Cats extends Animals {
    void meow() {
        System.out.println("Cat meows");
    }
}

public class HierarchicalInheritanceDemo {
    public static void main(String[] args) {
        Dogs d = new Dogs();
        Cats c = new Cats();

        d.eat();
        d.bark();

        c.eat();
        c.meow();
    }
}
