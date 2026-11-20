import java.util.Scanner;
public class arrayAddOfNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        System.out.print("Enter how many numbers you wanna add: ");
        int n=sc.nextInt();
        int array[]=new int[n];
        System.out.println("Enter "+n+" numbers");
        for (int m=0;m<n;m++){
            System.out.print("Enter number "+(m+1)+": ");
            array[m]=sc.nextInt();
        }
        System.out.println("The entered numbers are: ");
        for(int m=0;m<n;m++)
            sum=sum+array[m];
        System.out.println("Sum of numbers: "+sum);
        sc.close();
    }
}