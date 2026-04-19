/**
 * Interface = blueprint (only method declarations)
 */
interface AnimalInterface {

    // abstract method (no body)
    void sound();
}

// Class implementing interface
class DogInterface implements AnimalInterface {

    // MUST implement method
    public void sound() {
        System.out.println("Dog barks");
    }
}

public class InterfaceDemo {

    public static void main(String[] args) {

        AnimalInterface a = new DogInterface(); // polymorphism
        a.sound();
    }
}
