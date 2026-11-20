import java.util.Scanner;
public class whileLoopDecimalToHexadecimal {
    public static void main(String[] args) {
        int deci,dig,t,i=0,c=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Decimal Number: ");
        deci = sc.nextInt();
        t=deci;
        while(t!=0){
            c++;
            t=t/16;
        }
        int arr[] = new int[c];
        t=deci;
        while(i!=c){
            dig=t%16;
            arr[i]=dig;
            i++;
            t=t/16;
        }

        while(i!=0){
            if(arr[i-1]==10)
                System.out.print("a");
            else if(arr[i-1]==11)
                System.out.print("b");
            else if(arr[i-1]==11)
                System.out.print("b");
            else if(arr[i-1]==11)
                System.out.print("b");
            else if(arr[i-1]==11)
                System.out.print("b");
            else if(arr[i-1]==11)
                System.out.print("b");
            else{
                System.out.print(arr[i-1]);
            }
            i--;
        }
        sc.close();
    }
}