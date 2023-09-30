public class RomanToInteger_1 {

    static int getNumber(String s) {

        String roman = "IVXLCDM";
        int[] romanArr = {1, 5, 10, 50, 100, 500, 1000};
        int res = 0;
        int idx = 0;

        while (idx < s.length() - 1) {
            char currChar = s.charAt(idx);
            char nextChar = s.charAt(idx + 1);
            int currIdx = roman.indexOf(currChar);
            int nextIdx = roman.indexOf(nextChar);

            if (romanArr[currIdx] >= romanArr[nextIdx]) {
                res += romanArr[currIdx];
                idx++;
            } else {
                res += (romanArr[nextIdx] - romanArr[currIdx]);
                idx += 2;
            }
        }

        if (idx == s.length() - 1) {
            char c = s.charAt(idx);
            int idxC = roman.indexOf(c);
            res += romanArr[idxC];
        }
        return res;
    }

    public static void main(String[] args) {

        String romNumber = "VIII";
        System.out.println(getNumber(romNumber));
    }
}
