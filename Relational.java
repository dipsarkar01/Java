import java.util.Scanner;
public class Relational {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        //Relational Equals To
        System.out.println(a+"="+b+"?"+ (a == b));
        //Relational Not Equal To
        System.out.println(a+"≠"+b+"?"+ (a != b));
        //Relational Greater Than
        System.out.println(a+">"+b+"?"+ (a > b));
        //Relational Less Than
        System.out.println(a+"<"+b+"?"+ (a < b));
        //Relational Greater Than Equals To
        System.out.println(a+"≥"+b+"?"+ (a >= b));
        //Relational Less Than Equals To
        System.out.println(a+"≤"+b+"?"+ (a <= b));
        sc.close();
    }
}