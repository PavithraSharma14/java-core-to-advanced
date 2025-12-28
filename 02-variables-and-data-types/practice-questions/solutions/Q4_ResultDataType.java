// Program to explain result data type
class Q4_ResultDataType {
    public static void main(String[] args) {

        byte b = 4;
        char c = 'a';
        short s = 512;
        int i = 1000;
        float f = 3.14f;
        double d = 99.9954;

        double result = (f * b) + (i % c) - (d * s);

        System.out.println("Result = " + result);
        System.out.println("Data type of result is double");
    }
}

