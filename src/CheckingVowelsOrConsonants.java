import java.util.Scanner;

public class CheckingVowelsOrConsonants {

    public static void main(String args[]){

        System.out.println("Enter a letter :");

        Scanner sc = new Scanner(System.in);
        char ch = sc.next().charAt(0);

        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
            System.out.println("The letter is an vowel");
        } else {

            System.out.println("The letter is a consonant");
        }

    }
}