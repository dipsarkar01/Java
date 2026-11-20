import java.util.Scanner;
public class forLoopEvenSum {
    public static void main(String[] args) {
        int x = 2, y = 0, z = 0;
        Scanner sc = new Scanner(System.in);
        y = sc.nextInt();
        System.out.println("-:Even Numbers:-");
        for (int i = x; i <= y; i+= 2){
            System.out.print(i + " ");
            z = z + i;
        }
        System.out.println("\nTotal: " + z);
        sc.close();
    }
}