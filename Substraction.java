import java.util.Scanner;
public class Substraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m  = sc.nextInt();
        int n = sc.nextInt();
        int o = m - n;
        System.out.println(m+"-"+n+"="+o);
        sc.close();
    }
}