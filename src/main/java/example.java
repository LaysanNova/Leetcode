public class example {
    static void divide(int number) {

        while (number > 0) {

            System.out.print(number + " -> " + " " + number % 10 + "\n");
            number = number / 10;
        }

    }

    public static void main(String[] args) {

        divide(12563312);
    }
}
