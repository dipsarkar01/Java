import java.util.Scanner;
public class ifElseSimpleInterest {
    public static void main(String[] args){
        int total = 0, si = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter time: ");
        int t = sc.nextInt();
        System.out.println("Enter rate: ");
        int r = sc.nextInt();
        System.out.println("Enter Principal amount: ");
        int pm = sc.nextInt();

        if (r >= 1 && r <= 5){
            si = pm*t*r/100;
        }
        else if (r >= 6 && r <= 10){
            si = pm*t*r/100;
        }
        else if (r >= 11 && r <= 20){
            si = pm*t*r/100;
        }
        else{
            System.out.println("Error!");
        }
        System.out.println("Rate: "+r);
        System.out.println("Simple Interest: "+si);
        total = pm + si;
        System.out.println("Total amount: "+ total);
        sc.close();
    }
}