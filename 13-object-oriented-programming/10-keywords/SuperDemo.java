/**
 * super = refers to parent class
 */

class AnimalSuper {

    AnimalSuper() {
        System.out.println("Animal constructor");
    }

    void sound() {
        System.out.println("Animal sound");
    }
}

class DogSuper extends AnimalSuper {

    DogSuper() {
        super(); // call parent constructor
        System.out.println("Dog constructor");
    }

    void sound() {
        super.sound(); // call parent method
        System.out.println("Dog barks");
    }
}

public class SuperDemo {

    public static void main(String[] args) {

        DogSuper d = new DogSuper();
        d.sound();
    }
}