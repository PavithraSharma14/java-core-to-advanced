// Q1: How many times is "Hello" printed?
// The loop increments i twice: i++ in loop & i=i+1 inside body
// So i becomes: 0 → 2 → 4 → exits after 4
// Output: "Hello" printed 3 times

public class Q1_HowManyTimesPrinted {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello");
            i = i + 1;   // extra increment
        }
    }
}

