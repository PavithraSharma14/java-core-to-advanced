// Continue skips current iteration
public class ContinueStatementDemo {

    public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

            if (i == 3) {
                continue;   // skip printing 3
            }

            System.out.println(i);
        }
    }
}

