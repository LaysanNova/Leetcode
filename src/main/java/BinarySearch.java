public class BinarySearch {
    static int binarySearchInt(int[] row, int number) {

        int start = 0;
        int end = row.length - 1;
        int middle;

        while (start <= end) {
            middle = start + (end - start) / 2;
            System.out.println(middle);

            if (row[middle] == number) {
                return middle;
            }
            if (number < row[middle]) {
                end = middle - 1;
            } else start = middle + 1;
        }
        return -1;
    }


    static int binarySearchChar(char[] row, char number) {

        int start = 0;
        int end = row.length - 1;
        int middle;

        while (start <= end) {
            middle = start + (end - start) / 2;
            System.out.println(middle);

            if (row[middle] == number) {
                return middle;
            }
            if (number < row[middle]) {
                end = middle - 1;
            } else start = middle + 1;
        }
        return -1;
    }

    static int recursiveBinarySearch(int[] row, int number, int start, int end) {

        if ((number < row[start]) || (number > row[end])) {
            return -1;
        }
        int middle = start + (end - start) / 2;
        if (number == row[middle]) {
            return middle;
        }
        if (number < row[middle]) {
            return recursiveBinarySearch(row, number, start, middle - 1 );
        } else {
            return recursiveBinarySearch(row, number, middle + 1, end );
        }
    }


    public static void main(String[] args) {

        int[] row = new int[]{-3, -2, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        int myNumber = 4;
        System.out.println("Index: " + binarySearchInt(row, myNumber));

        System.out.println("recursive Index: " + recursiveBinarySearch(row, myNumber, 0, row.length - 1));

        char[] rowChar = new char[]{'a', 'b', 'c', 'd', 'e', 'f', 'g'};
        char myChar = 'e';
        System.out.println("Index: " + binarySearchChar(rowChar, myChar));
    }
}
