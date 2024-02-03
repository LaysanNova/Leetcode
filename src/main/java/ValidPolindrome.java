/*
https://leetcode.com/problems/valid-palindrome/

        A phrase is a palindrome if, after converting all uppercase letters into lowercase letters and removing all non-alphanumeric characters, it reads the same forward and backward. Alphanumeric characters include letters and numbers.

        Given a string s, return true if it is a palindrome, or false otherwise.



        Example 1:

        Input: s = "A man, a plan, a canal: Panama"
        Output: true
        Explanation: "amanaplanacanalpanama" is a palindrome.
        Example 2:

        Input: s = "race a car"
        Output: false
        Explanation: "raceacar" is not a palindrome.
        Example 3:

 */

public class ValidPolindrome {
    public static boolean isPalindrome(String s) {

        String result = s.toLowerCase().replaceAll("[^a-z]", ""); //replaceAll("[^a-zA-Z]", "");
        StringBuilder reverse = new StringBuilder();

        for (int i = result.length() - 1; i >= 0 / 2; i--){
            reverse.append(result.charAt(i));
        }

        return result.contentEquals(reverse);
    }

    public static boolean isPalindrome1(String s) {

        String result = s.toLowerCase().replaceAll("[^a-z]", ""); //replaceAll("[^a-zA-Z]", "");
        if (result.isEmpty() || result.length() == 1){
            return true;
        }

        int i = 0;
        while (result.charAt(i) == result.charAt(result.length() - i - 1)){
            if (i == result.length() / 2){
                return true;
            }
            i++;
        }
        return false;
    }

    public static void main(String[] args) {

        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome("race a car"));
        System.out.println(isPalindrome(" "));
        System.out.println(isPalindrome("0P"));

        System.out.println(isPalindrome1("A man, a plan, a canal: Panama"));
        System.out.println(isPalindrome1("race a car"));
        System.out.println(isPalindrome1(" "));
        System.out.println(isPalindrome1("0P"));
    }
}
