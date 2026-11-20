import java.util.Scanner;
public class ifElseWhileSumOfSet {
    public static void main(String[] args) {
        int n,sum=0;
        char a='t';
        System.out.println("Enter how many numbers to get sum and 0 to terminate Addition");
        Scanner sc = new Scanner(System.in);
        while (a!='f') {
            n=sc.nextInt();
            if(n==0)
                a='f';
            else
                sum=sum+n;
        }
        System.out.println("Sum= "+sum);
        sc.close();
    }
}