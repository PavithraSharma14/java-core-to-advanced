/**
 * Interface = blueprint (only method declarations)
 */
interface Animal {

    // abstract method (no body)
    void sound();
}

// Class implementing interface
class Dog implements Animal {

    // MUST implement method
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class InterfaceDemo {

    public static void main(String[] args) {

        Animal a = new Dog(); // polymorphism
        a.sound();
    }
}
