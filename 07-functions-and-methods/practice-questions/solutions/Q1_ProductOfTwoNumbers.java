public class Q1_ProductOfTwoNumbers {

    // Function that returns product of a and b
    static int product(int a, int b) {
        return a * b;  // call-by-value → copies of a & b are passed
    }

    public static void main(String[] args) {
        int result = product(5, 4);
        System.out.println("Product = " + result);
    }
}

