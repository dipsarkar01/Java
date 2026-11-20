import java.util.Scanner;

public class Logical {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean a = sc.nextBoolean();
        boolean b = sc.nextBoolean();
        //Logical Operater (AND)
        System.out.println("a && b = " + (a && b));
        //Logical Operater (OR)
        System.out.println("a || b = " + (a || b));
        //Logical Operater (NOT)
        System.out.println("! a = " + (! a));
        System.out.println("! b = " + (! b));
        sc.close();
    }
}