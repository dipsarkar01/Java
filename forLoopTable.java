import java.util.Scanner;
public class forLoopTable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x,y,z,n;
        System.out.println("Enter the number of your table: ");
        y = sc.nextInt();
        System.out.println("Enter limit of your table: ");
        n = sc.nextInt();
        for (x=1; x<=n; x++){
            z = y * x;
            System.out.println(y+" x "+x+" = "+z);
        }
        sc.close();
    }
}