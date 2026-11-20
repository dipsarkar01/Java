import java.util.Scanner;
public class salaryTaxCalculation {
    public static void main(String[] args) {
        String ename;
        double bsalary,da,ta,gs,pf,net,inc,tax=0.0,lim=250000;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Employee Name: ");
        ename=sc.nextLine().toUpperCase();
        System.out.print("Enter Basic Salary: ");
        bsalary=sc.nextInt();
        System.out.print("Enter Yearly Income: ");
        inc=sc.nextInt();
        da=bsalary*65/100;      //Dearness Allowance
        ta=bsalary*15/100;      //Travelling Allowance
        gs=bsalary+da+ta;       //Gross Salary
        pf=bsalary*12.5/100;    //Providend Fund
        net=gs-pf;              //Net Salary
        if(inc<=lim)
            tax=0;
        else if(inc<=300000)
            tax=(inc-lim)*2/100;
        else if(inc<=350000)
            tax=(inc-lim)*3.5/100;
        else if(inc<=400000)
            tax=(inc-lim)*5/100;
        else if(inc<=500000)
            tax=(inc-lim)*7/100;
        else
            tax=(inc-lim)*10/100;
        System.out.println("=========================================");
        System.out.println("Employee Name: "+ename);
        System.out.println("Basic Salary: "+bsalary);
        System.out.println("Dearness Allowance: "+da);
        System.out.println("Travelling Allowance: "+ta);
        System.out.println("Gross Salary: "+gs);
        System.out.println("Providend Fund: "+pf);
        System.out.println("Net Salary: "+net);
        System.out.println("The person has to pay Rs. "+tax);
        System.out.println("=========================================");
        sc.close();
    }
}