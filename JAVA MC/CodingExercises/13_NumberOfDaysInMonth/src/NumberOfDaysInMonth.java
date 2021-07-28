public class NumberOfDaysInMonth {

    public static boolean isLeapYear(int year) {

        return ((1 <= year) && (year <= 9999) && ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))));
    }

    public static int getDaysInMonth(int month, int year) {

        int daysInMonth = -1;

        if ((1 <= month) && (month <= 12) && (1 <= year) && (year <= 9999)) {
            switch (month) {
                case 1, 3, 5, 7, 8, 10, 12 -> daysInMonth = 31;
                case 4, 6, 9, 11 -> daysInMonth = 30;
                case 2 -> {
                    if (isLeapYear(year)) {
                        daysInMonth = 29;
                    } else {
                        daysInMonth = 28;
                    }
                }
            }
        }

        return daysInMonth;
    }
}
