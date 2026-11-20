import java.util.Scanner;
public class forLoopPyramidNum3 {
    public static void main(String[] args) {
        int x,y,z,a=1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your step: ");
        z=sc.nextInt();
        for (x=1;x<=z;x++){
            for (y=1;y<=x;y++){
                System.out.print(a+" ");
                a++;
            }
            System.out.println();
        }
        sc.close();
    }
}