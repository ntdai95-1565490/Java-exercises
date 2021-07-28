public class SumOddRange {

    public static boolean isOdd(int number) {

        if ((number < 1) || (number % 2 == 0)) {
            return false;
        }

        return true;
    }

    public static int sumOdd(int start, int end) {

        if ((start < 1) || (end < 1) || (end < start)) {
            return -1;
        }

        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (isOdd(i)) {
                sum += i;
            }
        }

        return sum;
    }
}
