/**
 * Demonstrates Shallow Copy.
 *
 * In shallow copy, object references are copied
 * instead of creating new internal objects.
 */

class Address {

    String city;

    Address(String city) {
        this.city = city;
    }
}

class StudentShallow {

    String name;
    Address address;

    StudentShallow(String name, Address address) {
        this.name = name;
        this.address = address;
    }
}

public class ShallowCopyExample {

    public static void main(String[] args) {

        Address addr = new Address("Hyderabad");

        StudentShallow s1 = new StudentShallow("Pavithra", addr);

        // Shallow copy
        StudentShallow s2 = s1;

        s2.address.city = "Delhi";

        // Both objects reflect the change
        System.out.println("s1 city: " + s1.address.city);
        System.out.println("s2 city: " + s2.address.city);
    }
}
