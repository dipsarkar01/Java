import java.util.Scanner;
public class ifElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a > 10)
            System.out.println("A is bigger than 10");
        else
            System.out.println("A is smaller than 10");
        sc.close();
    }
}