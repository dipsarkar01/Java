import java.util.Scanner;
public class matrixFindNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean found=false;
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
        System.out.println();
        System.out.print("Enter which number you wanna find: "+"\n");
        int find = sc.nextInt();
        for(int x=0;x<3;x++){
            for(int y=0;y<3;y++){
                if(a[x][y] == find)
                    found = true;
            }
        }
        if(found)
            System.out.println("Element found!");
        else
            System.out.println("Element not found!");
        sc.close();
    }
}