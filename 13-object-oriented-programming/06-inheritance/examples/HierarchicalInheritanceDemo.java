/**
 * Concept: Hierarchical Inheritance
 * Multiple child classes inherit from one parent class
 */

class AnimalHier {
    void eat() {
        System.out.println("Animal eats");
    }
}

class DogHier extends AnimalHier {
    void bark() {
        System.out.println("Dog barks");
    }
}

class CatHier extends AnimalHier {
    void meow() {
        System.out.println("Cat meows");
    }
}

public class HierarchicalInheritanceDemo {
    public static void main(String[] args) {
        DogHier d = new DogHier();
        CatHier c = new CatHier();

        d.eat();
        d.bark();

        c.eat();
        c.meow();
    }
}
