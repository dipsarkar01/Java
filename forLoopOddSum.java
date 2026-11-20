import java.util.Scanner;
public class forLoopOddSum {
    public static void main(String[] args) {
        int x = 1, y = 0, z = 0;
        Scanner sc = new Scanner(System.in);
        y = sc.nextInt();
        System.out.println("-:Odd Numbers:-");
        for (int i = x; i <= y; i+= 2){
            System.out.print(i + " ");
            z = z + i;
        }
        System.out.println("\nTotal: " + z);
        sc.close();
    }
}