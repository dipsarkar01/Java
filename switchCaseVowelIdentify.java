import java.util.Scanner;
public class switchCaseVowelIdentify {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter alphabet: ");
        char ch = Character.toLowerCase(sc.next().charAt(0));
        sc.close();
        switch(ch){
            case 'a':
                case 'e':
                    case 'i':
                        case 'o':
                            case 'u':
                                System.out.println(ch + " is a Vowel");
                                break;
                                default:
                                    System.out.println(ch + " is a Consonant");
        }

    }
}