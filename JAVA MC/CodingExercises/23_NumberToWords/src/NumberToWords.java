public class NumberToWords {

    public static int getDigitCount(int number) {

        if (number < 0) {
            return -1;
        } else if (number == 0) {
            return 1;
        }

        int count = 0;
        while (number > 0) {
            count++;
            number /= 10;
        }

        return count;
    }

    public static int reverse(int number) {

        int reversedNumber = 0;
        while (Math.abs(number) > 0) {

            if (reversedNumber != 0) {
                reversedNumber *= 10;
            }

            reversedNumber += number % 10;
            number /= 10;
        }

        return reversedNumber;
    }

    public static void numberToWords(int number) {

        if (number < 0) {
            System.out.println("Invalid Value");
        } else {
            StringBuilder wordsOfNumber = new StringBuilder();
            int reversedNumber = reverse(number);
            int numberOfDigits = getDigitCount(number);
            int count = 0;
            while (reversedNumber > 0) {

                if (!wordsOfNumber.toString().equals("")) {
                    wordsOfNumber.append(" ");
                }

                switch (reversedNumber % 10) {
                    case 0 -> wordsOfNumber.append("Zero");
                    case 1 -> wordsOfNumber.append("One");
                    case 2 -> wordsOfNumber.append("Two");
                    case 3 -> wordsOfNumber.append("Three");
                    case 4 -> wordsOfNumber.append("Four");
                    case 5 -> wordsOfNumber.append("Five");
                    case 6 -> wordsOfNumber.append("Six");
                    case 7 -> wordsOfNumber.append("Seven");
                    case 8 -> wordsOfNumber.append("Eight");
                    default -> wordsOfNumber.append("Nine");
                }

                count++;
                reversedNumber /= 10;
            }

            if (count != numberOfDigits) {
                wordsOfNumber.append(" Zero".repeat(Math.max(0, (numberOfDigits - count))));
            }

            System.out.println(wordsOfNumber);
        }
    }
}
