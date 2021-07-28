public class TeenNumberChecker {

    public static boolean hasTeen(int number1, int number2, int number3) {
        return (isTeen(number1) || isTeen(number2) || isTeen(number3));
    }

    public static boolean isTeen(int number) {
        return (13 <= number && number <= 19);
    }
}
