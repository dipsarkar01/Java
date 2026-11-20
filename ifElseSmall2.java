import java.util.Scanner;
public class ifElseSmall2 {
    public static void main(String[] args){
        int small = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number: ");
        int b = sc.nextInt();
        System.out.println("Enter 3rd number: ");
        int c = sc.nextInt();
        if (a < b && a < c)
            small = a;
        else if (b < a && b < c)
            small = b;
        else if (c < a && c < b)
            small = c;
        System.out.println("Smaller number is "+ small);
        sc.close();
    }
}