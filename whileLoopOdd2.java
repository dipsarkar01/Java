import java.util.Scanner;
public class whileLoopOdd2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter lower limit: ");
        int a = sc.nextInt();
        System.out.println("Enter higher limit: ");
        int b = sc.nextInt();
        sc.close();
        while(a <= b){
            if (a%2 == 0)
                System.out.println(a+ " ");
        a += 1;
        }
    }
}