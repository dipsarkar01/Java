import java.util.Scanner;
public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r,s=0,m,n;
        System.out.println("Enter number: ");
        m=sc.nextInt();
        n=m;
        while (n > 0) {
            r = n % 10;
            s += r * r * r;
            n /= 10;
        }
        if (s==m)
            System.out.println(m+" is a Armstrong number");
        else
            System.out.println(m+" not a Armstrong number");
        sc.close();
    }
}