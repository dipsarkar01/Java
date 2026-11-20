import java.util.Scanner;
public class forIfElseLCM2Num {
    public static void main(String[] args) {
        int a,b,max,i,LCM=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        a = sc.nextInt();
        System.out.println("Enter 2nd number: ");
        b = sc.nextInt();
        if(a>b)
            max = a;
        else
            max = b;
        for(i=max; i<=a*b; i++){
            if (i%a==0 && i%b==0){
                LCM = i;
                break;
            }
        }
        System.out.println("LCM of "+a+" & "+b+" is "+LCM);
        sc.close();
    }
}