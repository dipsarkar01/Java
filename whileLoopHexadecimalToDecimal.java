import java.util.Scanner;
public class whileLoopHexadecimalToDecimal {
    public static void main(String[] args) {
        String hexa;
        int dig=0,deci=0;
        System.out.print("Enter a Hexadecimal Number: ");
        Scanner sc = new Scanner(System.in);
        hexa=sc.next().toUpperCase();
        int len=hexa.length();
        System.out.println("Decimal Number is: ");
        for(int i=len-1,p=1; i>=0; i--,p=p*16){
            if(hexa.charAt(i)>='1' && hexa.charAt(i)<='9')
                dig=hexa.charAt(i)-48;
            else if(hexa.charAt(i)>='A' && hexa.charAt(i)<='F')
                dig=hexa.charAt(i)-55;
            deci=deci+(dig*p);
        }
        System.out.println(deci);
        sc.close();
    }
}