public class Q5_BinaryToDecimal {

    static int binaryToDecimal(int binary) {

        int decimal = 0;
        int power = 0;

        while (binary > 0) {
            int lastDigit = binary % 10;
            decimal += lastDigit * Math.pow(2, power);
            power++;
            binary /= 10;
        }

        return decimal;
    }

    public static void main(String[] args) {
        System.out.println(binaryToDecimal(1011)); // 11
    }
}
