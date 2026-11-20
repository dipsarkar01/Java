import java.util.Scanner;
public class matrixTranspose {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[][]=new int[3][3];
        System.out.println("Enter 9 number");
        for(int x=0;x<3;x++){
            for(int y=0;y<3;y++){
                a[x][y]=sc.nextInt();
            }
        }
        System.out.println("Matrix:");
        for(int x=0;x<3;x++){
            for(int y=0;y<3;y++){
                System.out.print(a[x][y]+"  ");
            }
            System.out.println();
        }
        System.out.println("\n");
        System.out.println("Transposed Matrix:");
        for(int y=0;y<3;y++){
            for(int x=0;x<3;x++){
                System.out.print(a[x][y]+"  ");
            }
            System.out.println();
        }
        sc.close();
    }
}