/**
 * Example: Constructor Overloading
 * Multiple constructors with different parameters.
 */

class Student {

    String name;
    int age;

    Student() {
        name = "Unknown";
        age = 0;
    }

    Student(String name) {
        this.name = name;
    }

    Student(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class ConstructorOverloadingExample {

    public static void main(String[] args) {

        Student s1 = new Student();
        Student s2 = new Student("Pavithra");
        Student s3 = new Student("Rahul", 22);

        System.out.println(s1.name);
        System.out.println(s2.name);
        System.out.println(s3.name + " " + s3.age);
    }
}
