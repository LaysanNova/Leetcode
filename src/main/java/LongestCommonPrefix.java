public class LongestCommonPrefix {

    public static String longestCommonPrefix(String[] strs) {

        // ************ 1 *******************************
        int s = 200;
        for (int i = 0; i < strs.length; i++) {
            if (strs.length > 200 || strs[i].length() > 200) {
                return "";
            }
            if (strs[i].length() < s) {
                s = strs[i].length();
            }
        }
        char[] ret = new char[s];
        int index = 0;
        for (int k = 0; k < s; k++) {
            for (int j = 1; j < strs.length; j++){
                if (strs[0].charAt(k) != strs[j].charAt(k)){
                    return String.valueOf(ret, 0, index);
                }
            }
            ret[k] = strs[0].charAt(k);
            index +=1;
        }
        return String.valueOf(ret, 0, index);

        /*
        ************* 2 *****************************
        String result = "";
        if (strs.length == 1) {
            return strs[0];
        } else {
            int minLength = 200;
            for (String str : strs) {
                if (minLength != 0 && str.length() < minLength) {
                    minLength = str.length();
                    result = str;
                }
            }

            if (minLength > 0) {
                for (String str : strs) {
                    if (!str.equals(result)) {
                        for (int i = 0; i < result.length(); i ++) {
                            if (result.charAt(i) != str.charAt(i)) {
                                result = result.substring(0, i);
                                if (result.isEmpty()) {
                                    return result;
                                }
                            }}}}}}

        return result;

        */
    }

    public static void main(String[] args) {

        System.out.println(longestCommonPrefix(new String[] {"flower","flow","flight"}));
        System.out.println(longestCommonPrefix(new String[] {"dog","racecar","car"}));
        System.out.println(longestCommonPrefix(new String[] {"aa", "a"}));

    }
}
