package academy.learnprogramming;

public class Main {

    public static void main(String[] args) {
//        int value = 3;
//        if (value == 1) {
//            System.out.println("Value was 1");
//        } else if (value == 2) {
//            System.out.println("Value was 2");
//        } else {
//            System.out.println("Was not 1 or 2");
//        }

        int switchValue = 3;

        switch (switchValue) {
            case 1 -> System.out.println("Value was 1");
            case 2 -> System.out.println("Value was 2");
            case 3, 4, 5 -> {
                System.out.println("was a 3, or a 4, or a 5");
                System.out.println("Actually it was a " + switchValue);
            }
            default -> System.out.println("Was not 1, 2, 3, 4 or 5");
        }

        char charValue = 'A';

        switch (charValue) {
            case 'A' -> System.out.println("A was found");
            case 'B' -> System.out.println("B was found");
            case 'C', 'D', 'E' -> {
                System.out.println(charValue + " was found");
            }
            default -> System.out.println("Could not find A, B, C, D, or E");
        }

        String month = "JuNE";
        switch (month.toUpperCase()) {
            case "JANUARY" -> System.out.println("Jan");
            case "JUNE" -> System.out.println("June");
            default -> System.out.println("Not sure");
        }
    }
}
