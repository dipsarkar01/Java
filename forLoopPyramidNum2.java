import java.util.Scanner;
public class forLoopPyramidNum2 {
    public static void main(String[] args) {
        int m,n,o;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your required step: ");
        o=sc.nextInt();
        for (m=1;m<=o;m++){
            for (n=1;n<=m;n++){
                System.out.print(m+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}