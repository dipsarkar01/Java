import java.util.Scanner;
public class ifElseWhileHighLowDigit {
    public static void main(String[] args) {
        int a=1;
        System.out.println("Enter any number to get the digits and Enter 0 to terminate.");
        Scanner sc = new Scanner(System.in);
        while(a!=0){
            int  n,dig,t,max=0,min=0;
            System.out.print("Enter a number: ");
            n=sc.nextInt();
            t=n;
            if(n!=0){
                while(t!=0){
                    dig=t%10;;
                    if(t==n){
                        max=dig;
                        min=dig;
                    }
                    else{
                        if(dig>max)
                            max=dig;
                        if(dig<min)
                            min=dig;
                    }
                    t=t/10;
                }
                System.out.println("In this number "+n+"\nLargest number is: "+max+"\nSmallest number is: "+min);
            }
            else
                a=0;
        }
        sc.close();
    }
}