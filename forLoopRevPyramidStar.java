import java.util.Scanner;
public class forLoopRevPyramidStar {
    public static void main(String[] args) {
        int i,j,n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter youre required step: ");
        n=sc.nextInt();
        for (i=n;i>=1;i--){
            for (j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}