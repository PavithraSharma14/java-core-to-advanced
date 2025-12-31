// Break stops the loop immediately
public class BreakStatementDemo {

    public static void main(String[] args) {

        for (int i = 1; i <= 10; i++) {

            if (i == 5) {
                break;   // exit loop
            }

            System.out.println(i);
        }
    }
}

