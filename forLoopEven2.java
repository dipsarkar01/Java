import java.util.Scanner;
public class forLoopEven2 {
    public static void main(String[] args){
        int x = 0, y = 0;
        Scanner sc = new Scanner(System.in);
        x = sc.nextInt();
        y = sc.nextInt();
        System.out.println("-:Even Numbers:-");
        for (int i = x; i <= y; i = i+2){
            System.out.print(i + " ");
        }
        sc.close();
    }
}