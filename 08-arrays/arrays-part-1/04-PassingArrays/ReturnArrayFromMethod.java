public class ReturnArrayFromMethod {

    public static int[] createArray() {
        int[] arr = {1, 2, 3, 4};
        return arr;
    }

    public static void main(String[] args) {

        int[] result = createArray();

        for(int i=0; i<result.length; i++) {
            System.out.print(result[i]+" ");
        }
    }
}

