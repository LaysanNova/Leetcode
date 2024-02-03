public class RomanToInteger_3 {
    public static int romanToInt(String s) {

        if (s.isEmpty() || s.length() > 15) {
            return 0;
        }

        int sum = 0;
        int num = 0;

        for (int i = s.length() - 1; i >= 0; i--) {

            switch (s.charAt(i)) {
                case 'I' -> num = 1;
                case 'V' -> num = 5;
                case 'X' -> num = 10;
                case 'L' -> num = 50;
                case 'C' -> num = 100;
                case 'D' -> num = 500;
                case 'M' -> num = 1000;
                default -> {return 0;}
            }

            if (4 * num < sum) {
                sum -= num;
            } else {
                sum += num;
            }
            num = 0;
        }

        if (sum < 1 || sum > 3999) {
            return 0;
        }

        return sum;
    }

    public static void main(String[] args) {

        System.out.println(romanToInt("MCMXCIV"));
    }
}
