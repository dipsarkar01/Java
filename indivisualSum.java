import java.util.Scanner;
class details{
    int num1;
    void getdata(int a){
        num1=a;
    }
}
class indivisualSum {
    public static void main(String[] args) {
        int a=1,sumev=0,sumod=0,iev=0,iod=0;
        details obj=new details();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any value to sum up even and odd sepepately.\nEnter 0 to terminate");
        while(a!=0){
            a=sc.nextInt();
            obj.getdata(a);
            if(obj.num1%2==0){
                sumev=sumev+obj.num1;
                iev++;
            }
            else{
                sumod=sumod+obj.num1;
                iod++;
            }
        }
        System.out.println("Sum of "+iev+" even numbers: "+sumev);
        System.out.println("Sum of "+iod+" odd numbers: "+sumod);
        sc.close();
    }
}