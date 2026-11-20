import java.util.Scanner;
public class forLoopOdd2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        System.out.println("-:Odd Numbers:-");
        for (int i = x; i <= y; i = i+2){
            System.out.print(i + " ");
        }
        sc.close();
    }
}