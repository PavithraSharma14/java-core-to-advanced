import java.util.Scanner; // Scanner helps us read input

// Program to take user input in Java
class InputDemo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); // create scanner object

        System.out.print("Enter your name: ");
        String name = sc.nextLine(); // reads a full line

        System.out.print("Enter your age: ");
        int age = sc.nextInt(); // reads an integer

        System.out.println("Hello " + name + "! Your age is " + age);

        sc.close(); // good practice
    }
}
