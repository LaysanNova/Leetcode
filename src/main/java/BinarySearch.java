public class BinarySearch {
    static int binarySearch(int[] row, int number) {

        int start = 0;
        int end = row.length - 1;
        int middle;

        while (start <= end ) {
            middle = start + (end - start) / 2;
            if (middle == number) {
                return middle;
            }
            if (number < row[middle]) {
                end = middle - 1;
            } else start = middle + 1;

            System.out.println(middle);
        }
        return 0;
    }

    public static void main(String[] args) {

        int[] row = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int myNumber = 13;
        System.out.println("your number: " + binarySearch(row, myNumber));
    }
}
