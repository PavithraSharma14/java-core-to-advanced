// Demonstrates: Method Scope vs Block Scope

class ScopeDemo {

    static int globalVar = 100;  // Accessible inside whole class

    static void methodExample() {

        int methodVar = 20;  // Method scope

        if (true) {
            int blockVar = 50;  // Block scope → exists only inside {}
            System.out.println("Inside block: blockVar = " + blockVar);
            System.out.println("Inside block: methodVar = " + methodVar);
        }

        // blockVar NOT accessible here → outside its block
        System.out.println("Inside method: methodVar = " + methodVar);
    }

    public static void main(String[] args) {

        methodExample();

        System.out.println("Global variable = " + globalVar);
        // methodVar NOT accessible here → outside method
    }
}

