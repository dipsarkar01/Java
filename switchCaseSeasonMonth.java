import java.util.Scanner;
public class switchCaseSeasonMonth {
    public static void main(String[] args){
        int month;
        System.out.println("Jan: 1, Feb: 2, Mar: 3, Apr: 4, May: 5, Jun: 6,\n Jul: 7, Aug: 8, Sep: 9, Oct: 10, Nov: 11, Dec: 12");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your month: ");
        month = sc.nextInt();
        switch(month){
            case 12:
            case 1:
            case 2:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Summer");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Rainy");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Spring");
                break;
            default:
                System.out.println("Wrong! Select between 1 to 12");
        }
        sc.close();
    }
}