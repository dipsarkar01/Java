import java.util.Scanner;
public class forLoopBinaryToDecimal {
    public static void main(String[] args) {
        int bin,dig,p=1,t,f=0,deci=0;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a Binary number: ");
        bin=sc.nextInt();
        for(t=bin;t!=0;t=t/10){
            if(t%10>1){
                f++;
                break;
            }
        }
        if(f==0){
            for(t=bin;t!=0;t=t/10){
                dig=t%10;
                deci=deci+dig*p;
                p=p*2;
            }
        }
        System.out.println("Decimal number: "+deci);
        sc.close();
    }
}

//Binary number for example: 11001