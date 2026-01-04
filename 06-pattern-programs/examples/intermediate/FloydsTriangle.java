// Prints Floyd's Triangle (continuous numbers)
public class FloydsTriangle {
    public static void main(String[] args) {

        int n = 4;
        int num = 1; // running number

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num++; // increment each time
            }

            System.out.println();
        }
    }
}

