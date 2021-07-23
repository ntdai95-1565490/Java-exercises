import java.util.Scanner;

public class WhileLoops {

    public static void main(String[] args) {

        int user_input = 0;
        Scanner scanner = new Scanner(System.in);

        while (user_input != 5) {
            System.out.println("Please, enter a number!");

            if (scanner.hasNextInt()) {
                user_input = scanner.nextInt();
            }

            scanner.nextLine();
        }

        System.out.println("Got it!");
    }
}
