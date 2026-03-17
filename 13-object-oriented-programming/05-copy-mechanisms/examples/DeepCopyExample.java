/**
 * Demonstrates Deep Copy.
 *
 * In deep copy, a completely new object
 * and its internal objects are created.
 */

class AddressDeep {

    String city;

    AddressDeep(String city) {
        this.city = city;
    }

    // Copy constructor
    AddressDeep(AddressDeep other) {
        this.city = other.city;
    }
}

class StudentDeep {

    String name;
    AddressDeep address;

    StudentDeep(String name, AddressDeep address) {
        this.name = name;
        this.address = new AddressDeep(address); // deep copy
    }
}

public class DeepCopyExample {

    public static void main(String[] args) {

        AddressDeep addr = new AddressDeep("Hyderabad");

        StudentDeep s1 = new StudentDeep("Pavithra", addr);

        StudentDeep s2 = new StudentDeep(s1.name, s1.address);

        s2.address.city = "Delhi";

        System.out.println("s1 city: " + s1.address.city);
        System.out.println("s2 city: " + s2.address.city);
    }
}