import java.util.Scanner;
public class ifElseWhileDivisor3rdVar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter lower limit: ");
        int x = sc.nextInt();
        System.out.println("Enter higher limit: ");
        int y = sc.nextInt();
        System.out.println("Enter the divisor: ");
        int z = sc.nextInt();
        while(x<=y){
            if (x%z==0)
                System.out.print(x+" ");
            x++;
        }
        sc.close();
    }
}