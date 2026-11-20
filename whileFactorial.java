import java.util.Scanner;
public class whileFactorial {
    public static void main(String[] args) {
        int f=1,i;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int n = sc.nextInt();
        i=1;
        while(i<=n){
            f=f*i;
            i++;
        }
        System.out.println("Factorial: "+f);
        sc.close();
    }
}