// Question 4: Understand ternary + comparison

public class Q3_TernaryResult {
    public static void main(String[] args) {

        int a = 63, b = 36;

        // (a < b) is false → x becomes false
        boolean x = (a < b) ? true : false;

        // (a > b) is true → y becomes a (63)
        int y = (a > b) ? a : b;

        System.out.println("x = " + x);
        System.out.println("y = " + y);
    }
}

