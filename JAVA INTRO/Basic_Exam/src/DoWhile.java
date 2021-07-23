import java.util.Scanner;

public class DoWhile {

    public static void main(String[] args) {

        int value;
        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("Please, enter an integer!");
            value = scanner.nextInt();
        } while (value <= 10);

        System.out.println("Integer greater than 10 detected!");
    }
}
