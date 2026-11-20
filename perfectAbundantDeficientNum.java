import java.util.Scanner;
public class perfectAbundantDeficientNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, sum=0, i=1;
        System.out.print("Enter a number: ");
        n=sc.nextInt();
        while (i<=n/2) {
            if(n%i==0)
                sum+=i;
            i++;
        }
        if(sum!=0)
            if(sum==n)
                System.out.println(n+" is a Perfect number.");
            else if(sum>n)
                System.out.println(n+" is a Abundant number.");
            else
                System.out.println(n+" is a Deficient number.");
        sc.close();
    }
}