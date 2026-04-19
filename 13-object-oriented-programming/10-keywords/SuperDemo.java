/**
 * super = refers to parent class
 */

class Animal {

    Animal() {
        System.out.println("Animal constructor");
    }

    void sound() {
        System.out.println("Animal sound");
    }
}

class Dog extends Animal {

    Dog() {
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

        Dog d = new Dog();
        d.sound();
    }
}