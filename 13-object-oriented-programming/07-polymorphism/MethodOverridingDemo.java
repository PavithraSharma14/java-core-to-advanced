/**
 * Method Overriding Example
 * Child class provides its own implementation
 */
class AnimalOverriding {

    // Parent method
    void sound() {
        System.out.println("Animal makes sound");
    }
}

class DogOverriding extends AnimalOverriding {

    // Overriding parent method
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

public class MethodOverridingDemo {
    public static void main(String[] args) {

        DogOverriding dog = new DogOverriding();

        // Calls overridden method
        dog.sound();
    }
}
