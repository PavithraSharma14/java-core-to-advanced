/**
 * Demonstrates a Copy Constructor in Java.
 * 
 * A copy constructor creates a new object
 * by copying values from another object.
 */

class StudentCopy {

    String name;
    int age;

    // Parameterized constructor
    StudentCopy(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Copy constructor
    StudentCopy(StudentCopy other) {
        this.name = other.name;
        this.age = other.age;
    }
}

public class CopyConstructorExample {

    public static void main(String[] args) {

        // Original object
        StudentCopy s1 = new StudentCopy("Pavithra", 21);

        // Copy object using copy constructor
        StudentCopy s2 = new StudentCopy(s1);

        System.out.println("Original: " + s1.name + " " + s1.age);
        System.out.println("Copy: " + s2.name + " " + s2.age);
    }
}