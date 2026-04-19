/**
 * static = shared across all objects
 */

class Student {

    String name;

    // shared variable
    static String college = "ABC College";

    Student(String name) {
        this.name = name;
    }

    void display() {
        System.out.println(name + " - " + college);
    }
}

public class StaticDemo {

    public static void main(String[] args) {

        Student s1 = new Student("Pavithra");
        Student s2 = new Student("Rahul");

        s1.display();
        s2.display();
    }
}
