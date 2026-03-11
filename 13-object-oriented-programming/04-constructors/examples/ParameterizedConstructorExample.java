/**
 * Example: Parameterized Constructor
 * Allows initializing objects with specific values.
 */

class Student {

    String name;
    int age;

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class ParameterizedConstructorExample {

    public static void main(String[] args) {

        Student s = new Student("Pavithra", 21);

        System.out.println(s.name + " - " + s.age);
    }
}
