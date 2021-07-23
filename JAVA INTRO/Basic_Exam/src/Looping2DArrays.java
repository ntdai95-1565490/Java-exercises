public class Looping2DArrays {

    public static void main(String[] args) {
        String[][] array = new String[2][3];

        array[0] = new String[] {"first", "second", "third"};
        array[1] = new String[] {"fourth", "fifth", "sixth"};

        for (String[] row: array) {
            for (String col: row) {
                System.out.print(col + " ");
            }

            System.out.println();
        }
    }
}
