public class NumberPalindrome {

    public static boolean isPalindrome(int number) {

        int originalNumber = number;
        int reversedNumber = 0;

        while (Math.abs(number) > 0) {

            if (reversedNumber != 0) {
                reversedNumber *= 10;
            }

            reversedNumber += number % 10;
            number /= 10;
        }

        return reversedNumber == originalNumber;
    }
}
