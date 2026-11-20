import java.util.Scanner;
public class ifElseWhileFirstLastDigitCheck {
    public static void main(String[] args) {
        int n1,t,id=0,dig=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        n1=sc.nextInt();
        id=n1%10;
        t=n1;
        while(t!=0){
            dig=t%10;
            t=t/10;
        }
        if(id==dig)
            System.out.println("The first and last digit of "+n1+" is same.");
        else
            System.out.println("The first and last digit of "+n1+" is different.");
        sc.close();
    }
}