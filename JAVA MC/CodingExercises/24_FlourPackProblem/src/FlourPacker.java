public class FlourPacker {

    public static boolean canPack(int bigCount, int smallCount, int goal) {

        if ((bigCount >= 0) && (smallCount >= 0) && (goal >= 0)) {

            int maximumBigPackets = Math.min(bigCount, goal / 5);
            for (int i = 0; i <= maximumBigPackets; i++) {
                if ((goal - i * 5) <= smallCount) {
                    return true;
                }
            }
        }

        return false;
    }
}
