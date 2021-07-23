import java.util.Scanner;

public class Switch {

    public static void main(String[] args) {

        System.out.println("Please, enter an integer!");
        Scanner scanner = new Scanner(System.in);

        int value = scanner.nextInt();

        switch (value) {
            case 1 -> System.out.println("Got 1.");
            case 66 -> System.out.println("Got 66.");
            default -> System.out.println("Got something else.");
        }
    }
}
