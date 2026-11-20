import java.util.Scanner;
public class ifElseSmall {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int a =  sc.nextInt();
        System.out.println("Enter 2nd number: ");
        int b = sc.nextInt();
        if (a < b)
            System.out.println("Smaller value is "+a);
        else
            System.out.println("Smaller value is "+b);
        sc.close();
    }
}