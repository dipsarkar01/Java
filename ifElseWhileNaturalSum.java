import java.util.Scanner;
public class ifElseWhileNaturalSum {
    public static void main(String[] args) {
        int c=1, sum=0, n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your limit: ");
        n = sc.nextInt();
        while (c<=n){
            System.out.println(c);
            sum = sum+c;
            c++;
        }
        System.out.println("Sum of first "+n+" natural number is: "+sum);
        sc.close();
    }
}