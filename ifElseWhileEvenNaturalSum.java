import java.util.Scanner;
public class ifElseWhileEvenNaturalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=0,n=2,sum=0,m;
        System.out.println("Enter how many odd natural numbers to be added: ");
        m = sc.nextInt();
        while (i<m){
            System.out.println(n);;
            sum = sum + n;
            i++;
            n = n+2;
        }
        System.out.println("The sum of First "+m+" odd natural numbers: "+sum);
        sc.close();
    }
}