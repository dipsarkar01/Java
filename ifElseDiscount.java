import java.util.Scanner;
public class ifElseDiscount {
    public static void main(String[] args){
        int amount = 0, discount = 0, pay = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print ("Item rate: ");
        int a = sc.nextInt();
        System.out.print ("Item quantity: ");
        int b = sc.nextInt();

        amount = a * b;
        System.out.println("Your total amount is: "+ amount);

        if (amount >= 1001 && amount <= 2000)
        {
            discount = amount*2/100;
            System.out.println("You will get 2% discount");
            System.out.println("Your discount amount: "+discount);
        }
        else if (amount >= 2001 && amount <= 5000)
        {
            discount = amount*5/100;
            System.out.println("You will get 5% discount");
            System.out.println("Your discount amount: "+discount);
        }
        else if (amount >= 5001 && amount <= 10000)
        {
            discount = amount*10/100;
            System.out.println("You will get 10% discount");
            System.out.println("Your discount amount: "+discount);
        }
        else
            System.out.println("You are not elligable for discount.");

        pay = amount - discount;
        System.out.println("You have to pay: "+pay);
        sc.close();
    }
}