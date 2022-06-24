import java.util.Scanner;

public class FirstLevel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Task1: Write a method that takes a String and a two chars. " +
                "As the result it returns the given String, where each the first char was replaced by the second char." +
                " You have to use only length() and charAt() methods of String class.");
        System.out.println("Please enter phrase");
        String phrase = scanner.nextLine();
        System.out.println("Please enter first char need to be replaced");
        String firstChar = scanner.nextLine();
        System.out.println("Please enter second char that you want to use to replace");
        String secondChar = scanner.nextLine();
        System.out.println(replaceChar(phrase, firstChar, secondChar));

        System.out.println();

        System.out.println("Task2");
        int[] array = createArray(scanner);
        int max = findMax(array);
        findMaxPosition(array, max);

        System.out.println();

        System.out.println("Task3");
        int[] array1 = createArray(scanner);
        countArraySum(scanner, array1);
    }

    private static void countArraySum(Scanner scanner, int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println("Sum of all array elements is: "+ sum);
    }

    private static void findMaxPosition(int[] array, int max) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == max) {
                System.out.printf("Maximum is on position %s", i);
            }
        }
    }

    private static int findMax(int[] array) {
        int max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }


    private static int[] createArray(Scanner scanner) {
        System.out.println("Enter array length");
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter array value: ");
            array[i] = scanner.nextInt();
        }
        return array;
    }

    private static String replaceChar(String phrase, String first, String second) {
        String string = "";
        for (int i = 0; i < phrase.length(); i++) {
            if (phrase.charAt(i) == first.charAt(0)) {
                string = string + second;
            } else {
                string = string + phrase.charAt(i);
            }
        }
        return string;

    }


}
