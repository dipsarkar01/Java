import java.util.Scanner;
public class forLoopSumDigit {
    public static void main(String[] args) {
        int j,k=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        int i=sc.nextInt();
        for (;i>0;i=i/10){
            j=i%10;
            k=k+j;
        }
        System.out.println("Sum of digits: "+k);
        sc.close();
    }
}