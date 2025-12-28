import java.util.*;

// Program to find average of 3 numbers
class Q1_AverageOfThree {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number A: ");
        int A = sc.nextInt();

        System.out.print("Enter number B: ");
        int B = sc.nextInt();

        System.out.print("Enter number C: ");
        int C = sc.nextInt();

        // Using double so we don't lose decimal value
        double average = (A + B + C) / 3.0;

        System.out.println("Average = " + average);

        sc.close();
    }
}

