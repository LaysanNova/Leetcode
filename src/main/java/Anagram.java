import java.util.Arrays;

public class Anagram {

    public boolean isAnagram(String str1, String str2) {

        if (str1.length() != str2.length()) {
            return false;
        }

        char[] chstr1 = str1.toCharArray();
        char[] chstr2 = str2.toCharArray();

        Arrays.sort(chstr1);
        Arrays.sort(chstr2);

        System.out.println(str1 + "  " + str2);

        for (int i = 0; i < chstr1.length; i++) {
            if (chstr1[i] != chstr2[i]) {
                return false;
            }
        }

        return true;
    }
}
