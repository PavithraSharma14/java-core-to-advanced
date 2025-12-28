/*
 * Implicit Type Conversion (Widening)
 * 
 * Java automatically converts a smaller data type
 * into a larger data type.
 * 
 * Example: int -> double
 */

class ImplicitConversionDemo {
    public static void main(String[] args) {

        int num = 10;         // int (4 bytes)
        double result = num;  // int -> double (8 bytes)

        System.out.println("Integer value: " + num);
        System.out.println("Converted to double: " + result);
    }
}
