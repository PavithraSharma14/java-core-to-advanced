/**
 * Example: Parameterized Constructor
 * Allows initializing objects with specific values.
 */

class ParameterizedStudent {

    String name;
    int age;

    ParameterizedStudent(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class ParameterizedConstructorExample {

    public static void main(String[] args) {

        ParameterizedStudent s = new ParameterizedStudent("Pavithra", 21);

        System.out.println(s.name + " - " + s.age);
    }
}
