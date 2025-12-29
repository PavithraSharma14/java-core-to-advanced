/*
 * Data Types in Java:
 *
 * Primitive Types:
 * byte, short, int, long  -> integers
 * float, double            -> decimals
 * char                     -> single character
 * boolean                  -> true / false
 *
 * Non-Primitive Type:
 * String                   -> sequence of characters
 */

class DataTypesDemo {
    public static void main(String[] args) {

        // ---- Integer types ----
        byte b = 10;           // 1 byte
        short s = 1000;        // 2 bytes
        int i = 50000;         // 4 bytes (most common)
        long l = 100000000L;   // 8 bytes (note the L)

        // ---- Decimal types ----
        float f = 5.75f;       // 4 bytes (note the f)
        double d = 99.99;      // 8 bytes

        // ---- Character ----
        char grade = 'A';

        // ---- Boolean ----
        boolean isJavaFun = true;

        // ---- String (non-primitive) ----
        String message = "Java is awesome!";

        // ---- Print all values ----
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + grade);
        System.out.println("boolean: " + isJavaFun);
        System.out.println("String: " + message);
    }
}
