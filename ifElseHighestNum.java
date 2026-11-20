import java.util.Scanner;
public class ifElseHighestNum {
    public static void main(String[] args) {
        int high;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int x = sc.nextInt();
        System.out.println("Enter 2nd number: ");
        int y = sc.nextInt();
        sc.close();

        if (x > y)
        high = x;
        else
        high = y;

        System.out.println("Highest number: " + high);
    }
}