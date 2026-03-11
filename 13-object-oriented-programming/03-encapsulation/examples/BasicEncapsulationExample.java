/**
 * Demonstrates basic encapsulation using private variables
 * and public getter/setter methods.
 */

class EncapsulatedStudent {

    private String name;
    private int age;

    public void setName(String name) {
        this.name = name; // set value
    }

    public String getName() {
        return name; // return value
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }
}

public class BasicEncapsulationExample {

    public static void main(String[] args) {

        EncapsulatedStudent s = new EncapsulatedStudent();

        s.setName("Pavithra");
        s.setAge(21);

        System.out.println("Name: " + s.getName());
        System.out.println("Age: " + s.getAge());
    }
}
