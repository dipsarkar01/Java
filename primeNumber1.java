import java.util.Scanner;
public class primeNumber1 {
    public static void main(String[] args) {
        int n, i = 1, c = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        n = sc.nextInt();
        while (i <= n){
            if (n%i == 0)
                c = c+1;
            i = i+1;
        }
        if (c == 2)
            System.out.println(n + " is a prime number");
        else
            System.out.println(n + "is not a prime number");
        sc.close();
    }
}