/**
 * Demonstrates Method Overriding in Polymorphism context
 */
class AnimalPoly {
    void sound() {
        System.out.println("Animal sound");
    }
}

class DogPoly extends AnimalPoly {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class PolymorphismOverridingDemo {
    public static void main(String[] args) {

        AnimalPoly obj = new DogPoly();

        // Runtime polymorphism
        obj.sound();
    }
}
