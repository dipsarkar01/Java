import java.util.Scanner;
public class ifElseWhileProductNum {
    public static void main(String[] args) {
        char a='t';
        System.out.println("Enter any number to gett the digits and enter 0 to terminate.");
        Scanner sc = new Scanner(System.in);
        while (a!='f'){
            int n,dig,t,pro=1;
            System.out.print("Enter a number: ");
            n=sc.nextInt();
            t=n;
            if(n!=0){
                while(t!=0){
                    dig=t%10;
                    pro=pro*dig;
                    System.out.print(dig+"");
                    t=t/10;
                }
                System.out.println("\nProduct of digit: "+pro);
                if(pro==0)
                    System.out.println("There have a digit as zero.");
                else
                    System.out.println("There have no digit as zero.");
            }
            else
                a='f';
        }
        sc.close();
    }
}