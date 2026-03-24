/**
 * Concept: Multilevel Inheritance
 * Chain of inheritance (Grandparent → Parent → Child)
 */

class AnimalMulti {
    void eat() {
        System.out.println("Animal eats");
    }
}

class DogMulti extends AnimalMulti {
    void bark() {
        System.out.println("Dog barks");
    }
}

class PuppyMulti extends DogMulti {
    void play() {
        System.out.println("Puppy plays");
    }
}

public class MultilevelInheritanceDemo {
    public static void main(String[] args) {
        PuppyMulti p = new PuppyMulti();

        p.eat();
        p.bark();
        p.play();
    }
}