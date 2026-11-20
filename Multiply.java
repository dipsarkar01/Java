import java.util.Scanner;
public class Multiply {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc.nextInt();
        int k = sc.nextInt();
        int l = i * j * k;
        System.out.println(i+"*"+j+"*"+k+"="+l);
        sc.close();
    }
}