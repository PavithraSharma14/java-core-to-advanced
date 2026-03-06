/**
 * Example: Multiple Objects
 *
 * A single class can be used to create multiple objects.
 * Each object maintains its own state (data).
 */

class MultiStudent {

    String name;
    int age;

    void display() {
        System.out.println(name + " - " + age);
    }
}

public class MultipleObjectsExample {

    public static void main(String[] args) {

        MultiStudent s1 = new MultiStudent();
        s1.name = "Pavithra";
        s1.age = 21;

        MultiStudent s2 = new MultiStudent();
        s2.name = "Rahul";
        s2.age = 22;

        s1.display();
        s2.display();
    }
}