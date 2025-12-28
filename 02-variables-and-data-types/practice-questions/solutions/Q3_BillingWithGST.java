import java.util.*;

// Program to calculate total cost + GST
class Q3_BillingWithGST {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter cost of pencil: ");
        float pencil = sc.nextFloat();

        System.out.print("Enter cost of pen: ");
        float pen = sc.nextFloat();

        System.out.print("Enter cost of eraser: ");
        float eraser = sc.nextFloat();

        float total = pencil + pen + eraser;

        System.out.println("Total bill (without GST) = " + total);

        // Adding 18% GST
        float gstAmount = total * 0.18f;
        float finalAmount = total + gstAmount;

        System.out.println("GST (18%) = " + gstAmount);
        System.out.println("Final bill (with GST) = " + finalAmount);

        sc.close();
    }
}

