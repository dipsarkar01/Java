import java.util.Scanner;
public class ifElseDoubleDigitIdentify {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int x = sc.nextInt();
        if (x >= -99 && x <= -10)
            System.out.println("It's a double digit number.");
        else if (x >= 10 && x <= 99)
            System.out.println("It's a double digit number.");
        else
            System.out.println("It's not a double digit number.");
        sc.close();
    }
}