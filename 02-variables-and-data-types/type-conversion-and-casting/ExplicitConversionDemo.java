/*
 * Explicit Type Casting (Narrowing)
 * 
 * We manually convert a larger data type into a smaller one.
 * 
 * Example: double -> int
 */

class ExplicitCastingDemo {
    public static void main(String[] args) {

        double price = 99.99;
        int newPrice = (int) price;  // double -> int (decimal part lost)

        System.out.println("Original price: " + price);
        System.out.println("After casting to int: " + newPrice);
    }
}
