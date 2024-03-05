import java.util.Arrays;

public class MaxInArray {

    public static double[] maxInArray(double[] array1, double[] array2) {

        if (array1.length != array2.length) {
            return new double[0];
        }

        Arrays.sort(array1);

        for (double element : array2) {
            if (array1[0] > element) {
                continue;
            }

            array1[0] = element;
            Arrays.sort(array1);
        }

        return array1;
    }

//    public static void main(String[] args) {
//
//        double[] array1 = {1.1, 2.2, 8.8, 9.0};
//        double[] array2 = {3.3, 4.4, 4.8, 12.0};
//
//        System.out.println(Arrays.toString(maxInArray(array1, array2)));
//    }
}
