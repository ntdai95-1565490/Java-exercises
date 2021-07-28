public class BarkingDog {

    public static boolean shouldWakeUp(boolean barking, int hourOfDay) {

        return barking && (8 > hourOfDay && hourOfDay >= 0) || (22 < hourOfDay && hourOfDay <= 23);
    }
}
