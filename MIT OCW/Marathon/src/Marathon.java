public class Marathon {

    public static void main (String[] arguments) {

        String[] names = {
                "Elena", "Thomas", "Hamilton", "Suzie", "Phil", "Matt", "Alex",
                "Emma", "John", "James", "Jane", "Emily", "Daniel", "Neda",
                "Aaron", "Kate"
        };

        int[] times = {
                341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299,
                343, 317, 265
        };

        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i] + ": " + times[i]);
        }

        System.out.println();

        // Fastest person
        int lowest_index = lowestTime(times);
        System.out.println(names[lowest_index] + " is the fastest runner with a time of "
                + times[lowest_index] + " minutes.");

        // Second fastest person
        int second_lowest_index = secondLowestTime(times);
        System.out.println(names[second_lowest_index] + " is the second fastest runner with a time of "
                + times[second_lowest_index] + " minutes.");
    }

    private static int lowestTime(int[] times) {
        int current_index = 0;
        int current_lowest = times[0];

        for (int i = 1; i < times.length; i++) {
            if (times[i] < current_lowest) {
                current_lowest = times[i];
                current_index = i;
            }
        }

        return current_index;
    }

    private static int secondLowestTime(int[] times) {
        int current_index;
        int current_lowest;
        int lowest_index = lowestTime(times);

        if (lowest_index == 0) {
            current_index = 1;
            current_lowest = times[1];
        } else {
            current_index = 0;
            current_lowest = times[0];
        }

        for (int i = 0; i < times.length; i++) {
            if (i != lowest_index && times[i] < current_lowest) {
                current_lowest = times[i];
                current_index = i;
            }
        }

        return current_index;
    }
}
