import java.util.*;

// Program to find area of a square
class Q2_AreaOfSquare {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side of square: ");
        int side = sc.nextInt();

        int area = side * side;

        System.out.println("Area of square = " + area);

        sc.close();
    }
}

