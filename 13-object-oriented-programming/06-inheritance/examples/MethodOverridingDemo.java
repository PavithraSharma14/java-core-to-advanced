/**
 * Method Overriding Example
 */
class AnimalOverride {
    void sound() {
        System.out.println("Animal sound");
    }
}

class DogOverride extends AnimalOverride {
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class MethodOverridingDemo {
    public static void main(String[] args) {
        AnimalOverride a = new DogOverride();
        a.sound();
    }
}