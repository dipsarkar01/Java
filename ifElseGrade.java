import java.util.Scanner;
public class ifElseGrade {
    public static void main(String[] args){
        // Total marks, grade
        int sum = 0, avg = 0, percnt = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print ("Computer Science marks: ");
        int a = sc.nextInt();
        System.out.print ("Physics marks: ");
        int b = sc.nextInt();
        System.out.print ("Math marks: ");
        int c = sc.nextInt();

        sum = a + b + c;
        avg = sum/3;
        percnt = (sum/300)*100;
        System.out.println("Total marks: "+sum);
        System.out.println("Avagage marks: "+ avg);

        if (percnt >= 90 && percnt <= 100)
            System.out.println("Grade A+");
        else if (percnt >= 80 && percnt <= 89)
            System.out.println("Grade A");
        else if (percnt >= 70 && percnt <= 79)
            System.out.println("Grade B+");
        else if (percnt >= 60 && percnt <= 69)
            System.out.println("Grade B");
        else if (percnt >= 50 && percnt <= 59)
            System.out.println("Grade C+");
        else if (percnt >= 40 && percnt <= 49)
            System.out.println("Grade C");
        else
            System.out.println("Fail");
        sc.close();
    }
}