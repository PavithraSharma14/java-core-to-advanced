/**
 * static = shared across all objects
 */

class StudentStatic {

    String name;

    // shared variable
    static String college = "ABC College";

    StudentStatic(String name) {
        this.name = name;
    }

    void display() {
        System.out.println(name + " - " + college);
    }
}

public class StaticDemo {

    public static void main(String[] args) {

        StudentStatic s1 = new StudentStatic("Pavithra");
        StudentStatic s2 = new StudentStatic("Vaishnavi");

        s1.display();
        s2.display();
    }
}
