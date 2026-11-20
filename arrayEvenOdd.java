import java.util.Scanner;
public class arrayEvenOdd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int i,n,a[]=new int[10],s2=0,s3=0,e=0,d=0;
        System.out.println("How manu numbers to be entered:");
        n=sc.nextInt();
        System.out.println("Enter "+n+" numbers:");
        for(i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        System.out.println("");
        for(i=0;i<n;i++){
            if(a[i]%2==0){
                s2=s2+a[i];
                e++;
            }
            else{
                s3=s3+a[i];
                d++;
            }
        }
        System.out.println("Sum of "+e+" even numbers:"+s2);
        System.out.println("Sum of "+d+" odd numbers:"+s3);
        sc.close();
    }
}