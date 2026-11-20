import java.util.Scanner;
public class forIfElseHCF2Num {
    public static void main(String[] args) {
        int a,b,min,i,HCF=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        a = sc.nextInt();
        System.out.println("Enter 2nd number: ");
        b = sc.nextInt();
        if(a<b)
            min = a;
        else
            min = b;
        for (i=min; i>=1; i--){
            if (a%i==0 && b%i==0){
                HCF = i;
                break;
            }
        }
        System.out.println("HCF of "+a+" & "+b+" is "+HCF);
        sc.close();
    }
}