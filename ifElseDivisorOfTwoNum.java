import java.util.Scanner;
public class ifElseDivisorOfTwoNum {
    public static void main(String[] args) {
        int n1,n2;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        n1=sc.nextInt();
        System.out.print("Enter the 2nd number: ");
        n2=sc.nextInt();

        if(n1%n2==0 && n1!=n2)
            System.out.println(n1+" is divisible by "+n2);
        else if(n2%n1==0 && n1!=n2)
            System.out.println(n2+" is divisible by "+n1);
        else if(n1%n2==0 && n2%n1==0)
            System.out.println("Both are equal");
        else
            System.out.println(n1+" & "+n2+" no one is divisible by each other");
        sc.close();
    }
}