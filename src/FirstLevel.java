import java.util.Scanner;

public class FirstLevel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Task1");
        System.out.println("Please enter phrase");
        String phrase = scanner.nextLine();
        System.out.println("Please enter first char");
        String firstChar = scanner.nextLine();
        System.out.println("Please enter second char");
        String secondChar = scanner.nextLine();
        replaceChar(phrase, firstChar, secondChar);

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
        System.out.println(sum);
    }

    private static void findMaxPosition ( int[] array, int max){
            for (int i = 0; i < array.length; i++) {
                if (array[i] == max) {
                    System.out.printf("Maximum is on position %s", i);
                }
            }
        }

    private static int findMax(int[] array) {
        int max= array[0];
        for (int i = 0; i < array.length; i++){
            if (array[i] > max){
                max = array[i];
            }
        }
        return max;
    }


    private static int[] createArray(Scanner scanner) {
        System.out.println("Enter array length");
        int n = scanner.nextInt();
        int[] array = new int[n];
        for (int i = 0; i < array.length; i++){
            System.out.println("Enter array value: ");
            array[i] = scanner.nextInt();
            }
        return array;
    }

    private static void replaceChar(String phrase, String first, String second) {
        for (int i = 0; i < phrase.length(); i++) {
            if (phrase.charAt(i) == first.charAt(0)) {
                System.out.print(second);
            } else {
                System.out.print(phrase.charAt(i));
            }
        }
    }



}
