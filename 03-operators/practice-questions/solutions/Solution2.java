import java.util.*;

class Solution2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        String result = (n > 0) ? "Positive" : (n < 0 ? "Negative" : "Zero");

        System.out.println(result);

        sc.close();
    }
}

