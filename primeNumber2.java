import java.util.Scanner;
public class primeNumber2 {
    public static void main(String[] args) {
        int n,i,flag=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number: ");
        n = sc.nextInt();
        for (i=2;i<n;i++){
            if (n%i==0){
                flag = 1;
                break;
            }
        }
        if (flag == 1)
            System.out.println(n+" not Prime number");
        else
            System.out.println(n+" a Prime number");
        sc.close();
    }
}