/*
 * Topic: StringBuilder in Java
 *
 * StringBuilder is a mutable sequence of characters.
 * It is used when frequent string modifications
 * are required.
 */

public class StringBuilderExample {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Java");

        // append
        sb.append(" Programming");

        // insert
        sb.insert(4, " Core");

        // delete
        sb.delete(4, 9);

        // replace
        sb.replace(0, 4, "JAVA");

        System.out.println(sb);
    }
}

