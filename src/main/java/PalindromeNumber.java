import java.util.stream.Stream;

public class PalindromeNumber {

    public static boolean isPalindrome(int x) {

        if (x >= 0 && x < 10) return true;
        if (x < 0 || x % 10 == 0) return false;

        int originalNum = x;
        int reversedNum = 0;
        int remainder;

        while (x != 0) {
            remainder = x % 10;

            reversedNum = reversedNum * 10 + remainder;
            x /= 10;
        }

        return originalNum == reversedNum;
    }

    public static void main(String[] args) {

        int[] numbers = {85202581, 121, -121, 0, 10};
        for (int number : numbers) {
            System.out.println("Number: " + number + " is palindrome " + isPalindrome(number));
        }
    }

}

