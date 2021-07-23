import java.util.ArrayList;

public class ArraysLoops {

    public static void main(String[] args) {

        float[] floating_arrays = {3.14f,5.7f, (float) 42.56, 894.32f, 89.43f};

        for (float floating_array : floating_arrays) {
            System.out.printf("%.2f ", floating_array);
        }

        System.out.println();

        ArrayList<Float> arrays = new ArrayList<>();

        arrays.add(3.14f);
        arrays.add(5.7f);
        arrays.add((float) 42.56);
        arrays.add(894.32f);
        arrays.add(89.43f);

        for (float value: arrays) {
            System.out.printf("%.2f ",value);
        }

    }

}
