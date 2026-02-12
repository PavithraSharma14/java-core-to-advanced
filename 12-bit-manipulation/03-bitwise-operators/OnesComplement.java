/**
 * Demonstrates the Bitwise NOT (~) operator.
 *
 * ~ flips all bits of a number.
 * 1 becomes 0
 * 0 becomes 1
 */
public class OnesComplement {

    /**
     * Performs one's complement using ~ operator.
     *
     * @param num input number
     * @return bitwise NOT of num
     */
    public static int onesComplement(int num) {
        return ~num;
    }

    public static void main(String[] args) {

        int num = 5;   // binary: 00000000 00000000 00000000 00000101

        /*
         * ~5 flips all bits:
         *
         * 00000000 00000000 00000000 00000101
         * becomes
         * 11111111 11111111 11111111 11111010
         *
         * This is -6 in two's complement form.
         */

        int result = onesComplement(num);

        System.out.println("Number = " + num);
        System.out.println("~Number = " + result);
    }
}

