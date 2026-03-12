/**
 * Example: Constructor Chaining
 * Using one constructor to call another using `this()`.
 */

class ChainingStudent {

    String name;
    int age;

    ChainingStudent() {
        this("Unknown", 0);
    }

    ChainingStudent(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

public class ConstructorChainingExample {

    public static void main(String[] args) {

        ChainingStudent s = new ChainingStudent();

        System.out.println(s.name + " " + s.age);
    }
}
