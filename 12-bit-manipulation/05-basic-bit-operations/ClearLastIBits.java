public class ClearLastIBits {

    /**
     * Clears the last i bits of a number
     * @param n the number
     * @param i number of bits to clear from right
     * @return result after clearing last i bits
     */
    public static int clearLastIBits(int n, int i) {
        int mask = (~0) << i;
        return n & mask;
    }

    public static void main(String[] args) {
        int n = 29;   // 11101
        int i = 2;

        int result = clearLastIBits(n, i);

        System.out.println("Original: " + n);
        System.out.println("After clearing last " + i + " bits: " + result);
    }
}
