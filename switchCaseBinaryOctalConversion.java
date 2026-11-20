import java.util.Scanner;
public class switchCaseBinaryOctalConversion {
    public static void main(String[] args) {
        int deci,bin=0,oct=0,choose,dig=0,p=1,t=1;
        char a='t';
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Decimal number: ");
        deci=sc.nextInt();
        System.out.println(+deci);
        while(a!='f'){
            System.out.println("Enter 1 to convert Binary:\nEnter 2 to convert Octal:\nEnter 0 to exit.");
            choose=sc.nextInt();
            switch(choose){
                case 1:{
                    for(t=deci,bin=0,p=1;t!=0;t=t/2,p=p*10){
                        dig=t%2;
                        bin=bin+dig*p;
                    }
                    System.out.println("Binary: "+bin+"\n");
                    break;
                }
                case 2:{
                    for(t=deci,oct=0,p=1;t!=0;t=t/8,p=p*10){
                        dig=t%8;
                        oct=oct+dig*p;
                    }
                    System.out.println("Octal: "+oct+"\n");
                    break;
                }
                case 0:{
                    a='f';
                    break;
                }
            }
        }
        sc.close();
    }
}