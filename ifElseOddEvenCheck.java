import java.util.Scanner;
public class ifElseOddEvenCheck {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int a = sc.nextInt();
        if (a%2 == 0)
            System.out.println("This is Even number");
        else
            System.out.println("This is Odd number");
        sc.close();
    }
}