import java.util.Scanner;
public class arrarSortAsc {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x[]=new int[5];
        System.out.println("Enter 5 numbers:");
        for(int i=0;i<5;i++){
            x[i]=sc.nextInt();
        }
        for(int i=0;i<5;i++){
            for(int j=i+1;j<5;j++){
                if(x[i]>x[j]){
                    int temp=x[i];
                    x[i]=x[j];
                    x[j]=temp;
                }
            }
        }
        System.out.println("Ascending order:");
        for(int i=0;i<5;i++){
            System.out.print(x[i]+" ");
        }
        sc.close();
    }
}