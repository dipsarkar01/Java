import java.util.Scanner;
public class arrayCountPosNegZero {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int pos=0,neg=0,zero=0;
        int a[]=new int[10];
        System.out.println("Enter 10 numbers:");
        for(int i=0;i<10;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<10;i++){
            if(a[i]>0)
                pos++;
            else if(a[i]<0)
                neg++;
            else
                zero++;
        }
        System.out.println("Total positive numbers: "+pos);
        System.out.println("Total negetive numbers: "+neg);
        System.out.println("Total zeros: "+zero);
        sc.close();
    }
}