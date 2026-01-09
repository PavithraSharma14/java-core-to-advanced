public class Q8_ScopeExample {

    static void methodScopeExample() {

        int methodVar = 10; // method scope

        if (true) {
            int blockVar = 20; // block scope
            System.out.println(blockVar);
            System.out.println(methodVar);
        }

        // blockVar not accessible here
        System.out.println(methodVar);
    }

    public static void main(String[] args) {
        methodScopeExample();
    }
}
