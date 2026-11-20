import java.util.Scanner;
public class forLoopPyramidNum {
    public static void main(String[] args) {
        int x,y,z;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your required step: ");
        z=sc.nextInt();
        for (x=1;x<=z;x++){
            for (y=1;y<=x;y++){
                System.out.print(y+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}