public class LastDigitChecker {

    public static boolean hasSameLastDigit(int number1, int number2, int number3) {

        return isValid(number1) && isValid(number2) && isValid(number3) &&
               ((number1 % 10 == number2 % 10) || (number2 % 10 == number3 % 10) ||
                (number1 % 10 == number3 % 10));
    }

    public static boolean isValid(int number) {

        return (10 <= number) && (number <= 1000);
    }
}
