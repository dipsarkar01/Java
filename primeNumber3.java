import java.util.Scanner;
public class primeNumber3 {
    public static void main(String[] args) {
        char a='t';
        System.out.println("Enter any number to find it's a prime or composit number. 0 to terminate");
        Scanner sc = new Scanner(System.in);
        while(a!='f'){
            int n,fc=0,i=1;
            System.out.print("Enter a number: ");
            n=sc.nextInt();
            if(n!=0){
                while(i<=n){
                    if (n%i==0)
                        fc++;
                    i++;
                }
                if(fc<=2)
                    System.out.println(n+" is a Prime Number");
                else
                    System.out.println(n+" is a Composit Number");
            }
            else
                a='f';
        }
        sc.close();
    }
}