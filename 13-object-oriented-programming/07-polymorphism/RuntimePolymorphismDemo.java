/**
 * Runtime Polymorphism Example
 * Parent reference → Child object
 */
class AnimalRuntime {

    void sound() {
        System.out.println("Animal sound");
    }
}

class DogRuntime extends AnimalRuntime {

    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

class CatRuntime extends AnimalRuntime {

    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

public class RuntimePolymorphismDemo {
    public static void main(String[] args) {

        // Parent reference pointing to Dog object
        AnimalRuntime a1 = new DogRuntime();
        a1.sound();  // Dog version

        // Parent reference pointing to Cat object
        AnimalRuntime a2 = new CatRuntime();
        a2.sound();  // Cat version
    }
}