import java.util.Scanner;

public class InputCalculator {

    public static void inputThenPrintSumAndAverage() {

        Scanner scanner = new Scanner(System.in);

        double sum = 0.0;
        double count = 0.0;

        while (true) {

            if (scanner.hasNextInt()) {
                sum += scanner.nextInt();
                count++;
            } else {
                break;
            }

            scanner.nextLine();
        }

        if (count != 0) {
            System.out.println("SUM = " + (int) sum + " AVG = " + Math.round(sum / count));
        } else {
            System.out.println("SUM = " + (int) sum + " AVG = " + (int) sum);
        }

        scanner.close();
    }
}
