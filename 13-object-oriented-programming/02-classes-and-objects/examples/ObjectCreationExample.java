/**
 * Example: Creating an Object
 *
 * Demonstrates how an object is created from a class
 * and how its fields and methods are accessed.
 */

class Student {

    String name;
    int age;

    // Method that prints student details
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class ObjectCreationExample {

    public static void main(String[] args) {

        // Object creation using 'new'
        Student s1 = new Student();

        // Assigning values to object fields
        s1.name = "Pavithra";
        s1.age = 21;

        // Calling a method using the object
        s1.display();
    }
}
