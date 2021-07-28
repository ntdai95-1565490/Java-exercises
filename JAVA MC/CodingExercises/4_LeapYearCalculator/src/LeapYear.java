public class LeapYear {

    public static boolean isLeapYear(int year) {

        return 1 <= year && year <= 9999 && (year % 4 == 0) && (!(year % 100 == 0) || (year % 400 == 0));
    }
}
