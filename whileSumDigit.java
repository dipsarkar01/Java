import java.util.Scanner;
public class whileSumDigit {
    public static void main(String[] args) {
        int r,s=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        while (n>9){
            r=n%10;
            s=s+r;
            n=n/10;
        }
        s=s+n;
        System.out.println("Sum of digits: "+s);
        sc.close();
    }
}