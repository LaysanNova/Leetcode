import java.util.Arrays;

public class Anagram {


    public boolean isAnagram(String str1, String str2){

        if (str1.length() != str2.length()){
            return false;
        }

        char[] chstr1 = str1.toCharArray();
        char[] chstr2 = str2.toCharArray();

        //************************************ 1
//        int[] arr = new int[26];
//
//        for (int i = 0; i < chstr1.length; i++){
//            int position1 = (int)chstr1[i] - 'a';
//            arr[position1] += 1;
//
//            int position2 = (int)chstr2[i] - 'a';
//            arr[position2] -= 1;
//        }
//
//        System.out.println(Arrays.toString(arr));
//
//        for (int i : arr) {
//            if (i != 0) {
//                return false;
//            }
//        }

        //************************************ 2


        Arrays.sort(chstr1);
        Arrays.sort(chstr2);

        System.out.println(str1 + "  " + str2);

        for (int i = 0; i < chstr1.length; i++) {
            if (chstr1[i] != chstr2[i]){
                return false;
            }
        }

        //******************************************

        return true;
    }

//    public static void main(String[] args) {
//        System.out.println(isAnagram("mama", "amma"));
//        System.out.println(isAnagram("mamam", "ammaa"));
//    }
}
