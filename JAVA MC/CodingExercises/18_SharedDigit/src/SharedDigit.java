public class SharedDigit {

    public static boolean hasSharedDigit(int number1, int number2) {

        return (10 <= number1) && (number1 <= 99) &&
               (10 <= number2) && (number2 <= 99) &&
               (((number1 % 10) == (number2 % 10)) || ((number1 / 10) == (number2 % 10)) ||
                ((number1 % 10) == (number2 / 10)) || ((number1 / 10) == (number2 / 10)));
    }
}
