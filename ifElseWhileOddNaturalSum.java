import java.util.Scanner;
public class ifElseWhileOddNaturalSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i=0,c=1,sum=0,n;
        System.out.println("Enter how many odd natural numbers to be added: ");
        n = sc.nextInt();
        while (i<n){
            System.out.println(c);;
            sum = sum + c;
            i++;
            c = c+2;
        }
        System.out.println("The sum of First "+n+" odd natural numbers: "+sum);
        sc.close();
    }
}