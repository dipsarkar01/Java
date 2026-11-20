import java.util.Scanner;
public class Ternary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Ternary Operator
        int max = (a > b) ? a : b;
        System.out.println("Maximum = " + max);
        sc.close();
    }
}