import java.util.Scanner;
public class Assignment {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        //Assignment Plus Equals To
        a += 5;
        System.out.println("a after += 5 : " + a);
        //Assignment Minus Equals To
        b -= 10;
        System.out.println("b after -= 10 : " + b);
        //Assignment Multiply Equals To
        a *= 6;
        System.out.println("a after *= 6 : " + a);
        //Assignment Divition Equals To
        b /= 5;
        System.out.println("b after /= 5 : " + a);
        sc.close();
    }
}