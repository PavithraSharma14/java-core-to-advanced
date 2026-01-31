/*
 * Topic: String Concatenation
 *
 * Concatenation means joining two or more strings.
 * In Java, this can be done using the '+' operator
 * or the concat() method.
 */

public class Concatenation {

    public static void main(String[] args) {

        String firstName = "Java";
        String lastName = "Developer";

        // Using + operator
        String fullName = firstName + " " + lastName;
        System.out.println("Using + operator: " + fullName);

        // Using concat() method
        String result = firstName.concat(" ").concat(lastName);
        System.out.println("Using concat() method: " + result);
    }
}

