import java.util.Scanner;

public class MinimumElement {

    public static void call() {
        int numberOfElements = readInteger();
        int[] array = readElements(numberOfElements);
        System.out.println("Min = " + findMin(array));
    }

    private static int readInteger() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a count:");
        int number = scanner.nextInt();
        scanner.nextLine();

        return number;
    }

    private static int[] readElements(int numberOfElements) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[numberOfElements];

        for (int i = 0; i < array.length; i++) {
            System.out.println("Enter a number:");
            int number = scanner.nextInt();
            scanner.nextLine();
            array[i] = number;
        }

        scanner.close();
        return array;
    }

    private static int findMin(int[] array) {

        int min = Integer.MAX_VALUE;

        for (int i = 0; i < array.length; i++) {
            int value = array[i];

            if (value < min) {
                min = value;
            }
        }

        return min;
    }
}
