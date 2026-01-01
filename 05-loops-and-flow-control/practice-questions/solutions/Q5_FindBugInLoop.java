// Q5: What is wrong with the code?
// The variable 'i' is declared inside the loop
// So it CANNOT be accessed outside the loop
// Fix: Declare i outside OR remove last print statement

public class Q5_FindBugInLoop {

    public static void main(String[] args) {

        int i;   // declare outside

        for (i = 0; i < 5; i++) {
            System.out.println("i = " + i);
        }

        System.out.println("i after the loop = " + i);
    }
}

