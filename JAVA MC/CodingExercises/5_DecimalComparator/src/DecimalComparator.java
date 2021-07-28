public class DecimalComparator {

    public static boolean areEqualByThreeDecimalPlaces(double number1, double number2) {
        int newNumber1 = (int) (number1 * 1000);
        int newNumber2 = (int) (number2 * 1000);

        return Math.abs(newNumber1 - newNumber2) == 0;
    }
}
