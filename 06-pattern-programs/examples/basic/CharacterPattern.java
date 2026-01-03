public class CharacterPattern {

    public static void main(String[] args) {

        int n = 4;
        char ch = 'A';

        for (int i = 1; i <= n; i++) {

            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
            }

            ch++; // move to next alphabet

            System.out.println();
        }
    }
}
