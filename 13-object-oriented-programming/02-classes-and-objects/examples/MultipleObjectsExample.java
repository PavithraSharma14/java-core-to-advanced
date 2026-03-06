/**
 * Example: Multiple Objects
 *
 * A single class can be used to create multiple objects.
 * Each object maintains its own state (data).
 */

class Student {

    String name;
    int age;

    void display() {
        System.out.println(name + " - " + age);
    }
}

public class MultipleObjectsExample {

    public static void main(String[] args) {

        // First object
        Student s1 = new Student();
        s1.name = "Pavithra";
        s1.age = 21;

        // Second object
        Student s2 = new Student();
        s2.name = "Rahul";
        s2.age = 22;

        // Each object behaves independently
        s1.display();
        s2.display();
    }
}