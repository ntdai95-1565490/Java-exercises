public class DiagonalStar {

    public static void printSquareStar(int number) {

        if (number < 5) {
            System.out.println("Invalid Value");
        } else {
            for (int row = 0; row < number; row++) {
                String rowResult = "";
                for (int column = 0; column < number; column++) {
                    if ((row == 0) || (row == number - 1) ||
                            (column == 0) || (column == number - 1) ||
                            (row == column) || (column + row == number - 1)) {
                        rowResult += "*";
                    } else {
                        rowResult += " ";
                    }
                }

                System.out.println(rowResult);
            }
        }
    }
}
