import java.util.Locale;
import java.util.Scanner;

public class SecondLevel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write method that checks whether a given string is a palindrome. A palindrome is a phrase that reads the same from the front and the back.");
        System.out.println("Enter phrase");
        String phrase = scanner.nextLine().replaceAll("\\s+","").toLowerCase();

        if (isPal(phrase)) {
            System.out.println("It is palindrom");
            } else {
            System.out.println("It is not a palindrom");
        }
    }

    private static boolean isPal(String phrase) {
        boolean isPal = false;
        for (int i = 0; i < phrase.length()/2; i++) {
            if (phrase.charAt(i) == phrase.charAt(phrase.length()-1-i)) {
             isPal = true;
            } else {
                isPal = false;
                break;
            }
        }
        return isPal;
    }


}
