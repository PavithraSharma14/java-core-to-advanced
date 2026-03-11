/**
 * Example: Constructor Overloading
 * Multiple constructors with different parameters.
 */

class OverloadedStudent{

    String name;
    int age;

    OverloadedStudent() {
        name = "Unknown";
        age = 0;
    }

    OverloadedStudent(String name) {
        this.name = name;
    }

    OverloadedStudent(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class ConstructorOverloadingExample {

    public static void main(String[] args) {

        OverloadedStudent s1 = new OverloadedStudent();
        OverloadedStudent s2 = new OverloadedStudent("Pavithra");
        OverloadedStudent s3 = new OverloadedStudent("Rahul", 22);

        System.out.println(s1.name);
        System.out.println(s2.name);
        System.out.println(s3.name + " " + s3.age);
    }
}
