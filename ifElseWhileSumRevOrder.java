import java.util.Scanner;
public class ifElseWhileSumRevOrder {
    public static void main(String[] args) {
        char a ='t';
        System.out.println("Enter any number to get the digits and enter 0 to terminate.");
        Scanner sc = new Scanner(System.in);
        while(a!='f'){
            int n,dig,t,sum=0;
            System.out.print("Enter a number: ");
            n=sc.nextInt();
            t=n;
            if(n!=0){
                while (t!=0) {
                    dig=t%10;
                    sum=sum+dig;
                    System.out.print(dig+"");
                    t=t/10;
                }
                System.out.println("\nSum of digits: "+sum);
                if(sum%2==0)
                    System.out.println("Sum is an Even number.");
                else
                    System.out.println("Sum is an Odd number.");
            }
            else
                a='f';
        }
        sc.close();
    }
}