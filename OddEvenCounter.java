import java.util.Scanner;
public class OddEvenCounter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the lower limit: ");
        int lowerLimit = sc.nextInt();
        System.out.print("Enter the upper limit: ");
        int upperLimit = sc.nextInt();
        sc.close();
        if (lowerLimit > upperLimit) {
            System.out.println("Invalid range! Lower limit must be less than or equal to upper limit.");
            return;
        }
        int evenCount = 0; 
        int oddCount = 0;  
        int current = lowerLimit;
        while (current <= upperLimit) {
            if (current % 2 == 0) {
                System.out.println(current+ " even");
                evenCount++; 
            } else {
                System.out.println(current+ " odd");
                oddCount++; 
            }
            current++; 
        }
        System.out.println("Count of even numbers: " + evenCount);
        System.out.println("Count of odd numbers: " + oddCount);
    }
}