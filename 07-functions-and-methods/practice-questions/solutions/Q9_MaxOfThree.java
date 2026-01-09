public class Q9_MaxOfThree {

    static int max(int a, int b, int c) {

        int maxValue = a;

        if (b > maxValue) {
            maxValue = b;
        }

        if (c > maxValue) {
            maxValue = c;
        }

        return maxValue;
    }

    public static void main(String[] args) {
        System.out.println(max(3, 9, 5)); // 9
    }
}
