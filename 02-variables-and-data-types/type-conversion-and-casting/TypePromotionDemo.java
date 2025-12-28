/*
 * Type Promotion in Expressions
 * 
 * In expressions:
 * - byte, short, char are promoted to int
 * - then normal type rules apply
 */

class TypePromotionDemo {
    public static void main(String[] args) {

        byte a = 10;
        byte b = 20;

        // a and b are promoted to int before addition
        int result = a + b;

        System.out.println("Result: " + result);


        // Example 2: mixed types
        int x = 5;
        double y = 6.5;

        double ans = x + y; // int -> double

        System.out.println("Answer: " + ans);
    }
}

