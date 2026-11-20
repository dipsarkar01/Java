import java.util.Scanner;
public class array2ndLargestNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a[]=new int[5];
        System.out.println("Enter any 5 numbers: ");
        for(int i=0;i<5;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<5;i++){
            for(int j=i+1;j<5;j++){
                if(a[i]<a[j]){
                    int temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }
        System.out.println("Largest number:"+a[0]);
        System.out.println("2nd Largest number:"+a[1]);
        sc.close();
    }
}