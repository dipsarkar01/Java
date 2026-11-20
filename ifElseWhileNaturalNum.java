import java.util.Scanner;
public class ifElseWhileNaturalNum {
    public static void main(String[] args) {
        int n,i=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your limit: ");
        n = sc.nextInt();
        while (i<=n){
            System.out.print(i);
            if (i<n)
                System.out.print(",");
            i++;
        }
        sc.close();
    }
}