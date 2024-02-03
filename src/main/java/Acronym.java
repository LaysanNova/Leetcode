import java.util.List;

public class Acronym {

    /*
    https://leetcode.com/problems/check-if-a-string-is-an-acronym-of-words/
    */

    public boolean acronym1(List<String> words, String s) {

        String ns = "";
        for (int i = 0; i < words.size(); i++){
            ns += words.get(i).charAt(0);
        }
        return s.equals(ns);
    }

    public boolean acronym2(List<String> words, String s) {

        char[] ch = new char[words.size()];

        for (int i = 0; i < words.size(); i++){
           ch[i] = words.get(i).charAt(0);
        }
        return String.valueOf(ch).equals(s);
    }

    public boolean acronym3(List<String> words, String s) {

        StringBuilder ns = new StringBuilder();

        for (String i: words ){
            ns.append(i.charAt(0));
        }
        return ns.toString().equals(s);
    }

    public boolean acronym4(List<String> words, String s) {

        if (words.size() != s.length()){
            return false;
        } else {
            char [] arr = new char[words.size()];

            for (int i = 0; i < words.size(); i++) {
                arr[i]= words.get(i).charAt(0);
            }

            for(int i = 0; i< arr.length; i++){
                if (arr[i] != s.charAt(i)) {
                    return false;
                }
            }
            return true;
        }
    }
}
