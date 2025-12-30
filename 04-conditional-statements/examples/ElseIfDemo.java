// Program: Print grade based on score
public class ElseIfDemo {
    public static void main(String[] args) {

        int score = 85;  // example score

        // multiple conditions are checked one by one
        if (score >= 90) {
            System.out.println("Grade: A");
        } else if (score >= 75) {
            System.out.println("Grade: B");
        } else if (score >= 50) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: Fail");
        }
    }
}

