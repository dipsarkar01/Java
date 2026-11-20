import java.util.Scanner;
public class ifElseTripleDigitIdentify {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int x = sc.nextInt();
        if (x >= -999 && x <= -100)
            System.out.println("It's a triple digit number.");
        else if (x >= 100 && x <= 999)
            System.out.println("It's a triple digit number.");
        else
            System.out.println("It's not a triple digit number.");
        sc.close();
    }
}