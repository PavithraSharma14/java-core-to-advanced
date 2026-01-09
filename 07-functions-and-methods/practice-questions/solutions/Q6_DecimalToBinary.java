public class Q6_DecimalToBinary {
    static int decimalToBinary(int decimal) {

        int binary = 0;
        int power = 0;

        while (decimal > 0) {
            int remainder = decimal % 2;
            binary += remainder * Math.pow(10, power);
            power++;
            decimal /= 2;
        }

        return binary;
    }

    public static void main(String[] args) {
        System.out.println(decimalToBinary(10)); // 1010
    }
}
