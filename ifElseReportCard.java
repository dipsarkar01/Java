import java.util.Scanner;
public class ifElseReportCard {
    public static void main(String[] args) {
        String sname, sclass;
        int cs,math,phy,max=0,min=0;
        float avg, total;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student's name: ");
        sname=sc.nextLine();
        System.out.print("Enter Student's class:");
        sclass=sc.nextLine();
        System.out.print("Enter obtain marks of Computer Science: ");
        cs=sc.nextInt();
        System.out.print("Enter obtain marks of Math: ");
        math=sc.nextInt();
        System.out.print("Enter obtain marks of Physics: ");
        phy=sc.nextInt();
        total= cs+math+phy;
        avg=total/3;
        if(cs>math&&cs>phy)
            max=cs;
        else if(math>cs&&math>phy)
            max=math;
        else
            max=phy;

        if(cs<math&&cs<phy)
            min=cs;
        else if(math<cs&&math<phy)
            min=math;
        else
            min=phy;

        System.out.println("=====================================================");
        System.out.println("Name: "+sname);
        System.out.println("Class: "+sclass);
        System.out.println("Computer Science"+"  "+"Math"+"  "+"Physics");
        System.out.println(cs+"\t"+"\t"+"  "+math+"\t"+phy+"\t");
        System.out.println("Total: "+total);
        System.out.println("Average: "+avg);
        System.out.println("Minimum: "+min);
        System.out.println("Maximum: "+max);
        if(min<40)
            System.out.println("You are Failed!");
        else
            System.out.println("You are Passed!");
        System.out.println("=====================================================");
        sc.close();
    }
}