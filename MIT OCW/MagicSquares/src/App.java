import java.io.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        checkingSum("Luna.txt");
        checkingSum("Mercury.txt");
    }

    private static void checkingSum(String filename) {
        List<List<Integer>> magicNumbers = readingNumbers(filename);
        double targetSum = 0;
        double[] columnSums = new double[magicNumbers.size()];
        double upDownDiagonalSum = 0;
        double downUpDiagonalSum = 0;


        for (int i = 0; i < magicNumbers.size(); i++) {
            double rowSum = 0;
            for (int j = 0; j < magicNumbers.get(i).size(); j++) {
                rowSum = rowSum + magicNumbers.get(i).get(j);
                columnSums[j] = columnSums[j] + magicNumbers.get(i).get(j);

                if (i == j) {
                    upDownDiagonalSum = upDownDiagonalSum + magicNumbers.get(i).get(j);
                }

                if (i + j + 1 == magicNumbers.size()) {
                    downUpDiagonalSum = downUpDiagonalSum + magicNumbers.get(i).get(j);
                }
            }

            if (i == 0) {
                targetSum = rowSum;
            } else if (targetSum != rowSum) {
                System.out.println("The given numbers in the " + filename + " do not create a magic square.");
                return;
            }
        }

        if (upDownDiagonalSum != targetSum || downUpDiagonalSum != targetSum) {
            System.out.println("The given numbers in the " + filename + " do not create a magic square.");
            return;
        }

        for (double columnSum : columnSums) {
            if (targetSum != columnSum) {
                System.out.println("The given numbers in the " + filename + " do not create a magic square.");
                return;
            }
        }

        System.out.println("The given numbers in the " + filename + " create a magic square.");
    }

    private static List<List<Integer>> readingNumbers(String filename) {
        List<List<Integer>> magicNumbers = new ArrayList<>();
        File file = new File(filename);

        try (BufferedReader br = new BufferedReader(new FileReader(file))) {

            String line;
            while ((line = br.readLine()) != null) {
                if (!line.equals("")){

                    String[] lineString = line.split("\\t");
                    List<Integer> magicRow = new ArrayList<>();
                    for (int i = 0; i < lineString.length; i++) {
                        if (!Array.get(lineString, i).equals("")) {
                            int number = Integer.parseInt(lineString[i]);
                            magicRow.add(number);
                        }
                    }

                    magicNumbers.add(magicRow);
                }
            }

        } catch (FileNotFoundException e) {
            System.out.println("Can't find file " + filename);
        } catch (IOException e) {
            System.out.println("Unable to open file: " + filename);
        }

        return magicNumbers;
    }
}
