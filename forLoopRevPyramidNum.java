import java.util.Scanner;
public class forLoopRevPyramidNum {
    public static void main(String[] args) {
        int x,y,z;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your step: ");
        z=sc.nextInt();
        for (x=z;x>=1;x--){
            for (y=1;y<=x;y++){
                System.out.print(y+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}