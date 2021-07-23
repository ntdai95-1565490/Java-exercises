public class GravityCalculator2 {

    public static void main(String[] arguments) {

        /*
         * x(t) = 0.5 * a * t^2 + vi * t + xi
         *
         * Variable    Meaning                  Value
         *
         * a           Acceleration (m/s^2)     -9.81
         * t           Time (s)                 10
         * vi          Initial velocity (m/s)   0
         * xi          Initial position         0
         */

        double gravity = -9.81; // Earth's gravity in m/s^2
        double initialVelocity = 0.0;
        double fallingTime = 10.0;
        double initialPosition = 0.0;
        double finalPosition;

        finalPosition = 0.5 * gravity * Math.pow(fallingTime, 2) +
                initialVelocity * fallingTime + initialPosition;

        System.out.println("The object's position after " + fallingTime +
                " seconds is " + finalPosition + " m.");
    }
}
