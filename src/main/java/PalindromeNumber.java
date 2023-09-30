public class PalindromeNumber {

    public boolean isPalindrome(int x) {

        if (x >= 0 && x < 10) return true;
        if (x < 0 || x % 10 == 0) return false;

        int originalNum = x;
        int reversedNum = 0;

        while (x != 0) {
//          remainder = x % 10;
            reversedNum = reversedNum * 10 + (x % 10);
            x /= 10;
        }
        return originalNum == reversedNum;
        }
    }

