package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {

//        int count = 6;
//        while (count != 6) {
//            System.out.println("Count value is " + count);
//            count++;
//        }
//
//        for (count = 1; count != 6; count++) {
//            System.out.println("Count value is " + count);
//        }
//
//        count = 6;
//        do {
//            System.out.println("Count value is " + count);
//            count++;
//
//            if (count > 100) {
//                break;
//            }
//        } while (count != 6);

//        int number = 4;
//        int finishNumber = 20;
//
//        while (number <= finishNumber) {
//            number++;
//            if (!isEvenNumber(number)) {
//                continue;
//            }
//
//            System.out.println("Even number " + number);
//        }

        int number = 4;
        int finishNumber = 20;
        int evenNumberFound = 0;

        while (number <= finishNumber) {
            number++;
            if (!isEvenNumber(number)) {
                continue;
            }

            System.out.println("Even number " + number);

            evenNumberFound++;
            if (evenNumberFound >= 5) {
                break;
            }
        }

        System.out.println("Total even numbers found = " + evenNumberFound);
    }

    public static boolean isEvenNumber(int number) {
        return (number % 2) == 0;
    }
}
