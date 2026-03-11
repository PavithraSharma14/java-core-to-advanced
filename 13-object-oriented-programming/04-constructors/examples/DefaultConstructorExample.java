/**
 * Example: Default Constructor
 * A constructor with no parameters.
 */

class DefaultStudent {

    String name;

    DefaultStudent() {
        name = "Unknown";
    }
}

public class DefaultConstructorExample {

    public static void main(String[] args) {

        DefaultStudent s = new DefaultStudent();
        System.out.println("Name: " + s.name);
    }
}
