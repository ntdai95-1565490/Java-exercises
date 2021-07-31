public class LargestPrime {

    public static int getLargestPrime(int number) {

        if (number < 2) {
            return -1;
        }

        int largestPrime = 2;
        for (int i = 2; i <= number; i++) {

            if ((number % i == 0) && (i > largestPrime)) {
                boolean isPrime = true;
                for (int j = 2; j <= Math.sqrt(i); j++) {

                    if (number % j == 0) {
                        isPrime = false;
                        break;
                    }
                }

                if (isPrime) {
                    largestPrime = i;
                }
            }
        }

        return largestPrime;
    }
}
