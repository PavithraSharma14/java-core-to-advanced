/**
 * Example: Default Constructor
 * A constructor with no parameters.
 */

class Student {

    String name;

    Student() {
        name = "Unknown";
    }
}

public class DefaultConstructorExample {

    public static void main(String[] args) {

        Student s = new Student();

        System.out.println("Name: " + s.name);
    }
}
