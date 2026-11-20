import java.util.Scanner;
public class ifElseDrivingLicence {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age: ");
        int a = sc.nextInt();
        if (a >= 18)
            System.out.println("Congratulations, you can drive!");
        else
            System.out.println("Sorry, you can't drive. "+"Because your age is "+a);
        sc.close();
    }
}