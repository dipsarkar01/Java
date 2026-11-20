import java.util.Scanner;
public class ifElseBig2 {
    public static void main(String[] args){
        int big = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number: ");
        int b = sc.nextInt();
        System.out.println("Enter 3rd number: ");
        int c = sc.nextInt();
        if (a > b && a > c)
            big = a;
        else if (b > a && b > c)
            big = b;
        else if (c > a && c > b)
            big = c;
        System.out.println("Bigger number is "+big);
        sc.close();
    }
}