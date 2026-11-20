import java.util.Scanner;
public class ifElseSingleDigitIdentify {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int a = sc.nextInt();
        if (a >= -9 && a <= 9)
            System.out.println("It's a single digit number.");
        else
            System.out.println("It's not a single digit.");
        sc.close();
    }
}