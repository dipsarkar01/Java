import java.util.Scanner;
public class arrayFindNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
        System.out.println("Enter 5 numbers:");
        for(int x=0;x<5;x++){
            a[x]=sc.nextInt();
        }
        System.out.println("Enter number to search:");
        int n=sc.nextInt();
        boolean found=false;
        for(int i=0;i<5;i++){
            if(a[i]==n){
                System.out.println("Number found at index "+i);
                found=true;
                break;
            }
        }
        if(found==false)
            System.out.println("Number not found!");
        sc.close();
    }
}