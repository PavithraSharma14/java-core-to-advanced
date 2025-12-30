// Program: Example of nested if statements
public class NestedIfDemo {
    public static void main(String[] args) {

        int age = 20;
        boolean hasID = true;

        // outer if
        if (age >= 18) {

            // inner if
            if (hasID) {
                System.out.println("Access Granted");
            } else {
                System.out.println("Access Denied: ID Required");
            }

        } else {
            System.out.println("Access Denied: Underage");
        }
    }
}

