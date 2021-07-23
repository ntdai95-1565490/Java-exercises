import java.util.Scanner;

public class InteractiveProgram {

    public static void main(String[] args) {

        System.out.println("Please, enter an integer!");
        Scanner scanner = new Scanner(System.in);
        int user_input = scanner.nextInt();

        if (user_input < 10) {
            System.out.println("This number is too small.");
        } else {
            System.out.println("This number is big enough.");
        }
    }
}
