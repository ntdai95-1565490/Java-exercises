public class TwoDimensionalArrays {

    public static void main(String[] args) {
        String[][] array = new String[2][3];

        array[0] = new String[] {"first", "second", "third"};
        array[1] = new String[] {"fourth", "fifth", "sixth"};

        System.out.println(array[1][2]);
    }
}
