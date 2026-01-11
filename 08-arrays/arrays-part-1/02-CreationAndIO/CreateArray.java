public class CreateArray {
    public static void main(String[] args) {

        // Declaration and creation of array
        int[] numbers = new int[5];

        // Initialization using index
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;

        // Declaration + initialization together
        int[] marks = {85, 90, 78};

        System.out.println("Array created successfully");
        System.out.println("Size of numbers array: " + numbers.length);
        System.out.println("Size of marks array: " + marks.length);
    }
}
