import java.util.Scanner;
public class matrixCountOddEven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int even=0,odd=0;
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
        for(int x=0;x<3;x++){
            for(int y=0;y<3;y++){
                if((a[x][y]%2)==0){
                    even++;
                }
                else{
                    odd++;
                }
            }
        }
        System.out.println("Total odd numbers:"+odd+"\n"+"Total even numbers:"+even);
        sc.close();
    }
}