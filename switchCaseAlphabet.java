import java.util.Scanner;
public class switchCaseAlphabet {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a alphabet: ");
        char m = Character.toLowerCase(sc.next().charAt(0));
        switch(m){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonant");
        }
        sc.close();
    }
}