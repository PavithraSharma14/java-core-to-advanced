// Demonstrates: Call by Value in Java
// Java ALWAYS passes a COPY of the value to methods.

class CallByValueDemo {

    static void changeValue(int x) {
        x = 50;   // only the local copy changes
    }

    public static void main(String[] args) {

        int a = 10;
        System.out.println("Before method call, a = " + a);

        changeValue(a);

        System.out.println("After method call, a = " + a);
        // a is still 10 → because Java is CALL BY VALUE
    }
}

