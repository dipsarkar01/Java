import java.util.Scanner;
public class ifElseWhileReverseOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,dig,t;
        System.out.print("Enter a number: ");
        n=sc.nextInt();
        t=n;
        while(t!=0){
            dig=t%10;
            System.out.print(dig);
            t=t/10;
        }
        sc.close();
    }
}