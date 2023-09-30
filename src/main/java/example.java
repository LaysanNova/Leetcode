public class example {

    static void devide(int number) {

        while (number > 0) {

            System.out.print(number + " -> ");
            System.out.print(" " + number % 10);
            number = number / 10;
            System.out.println();        }

        System.out.println();

    }

    public static void main(String[] args) {
        devide(12563312);

        Variable variable = new Variable();
    }
}
