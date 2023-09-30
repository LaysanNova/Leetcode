import java.util.HashMap;

public class RomanToInteger_2 {

    static int getNumber(String s) {

        HashMap<Character, Integer> romanValues = new HashMap<>();
        romanValues.put('I', 1);
        romanValues.put('V', 5);
        romanValues.put('X', 10);
        romanValues.put('L', 50);
        romanValues.put('C', 100);
        romanValues.put('D', 500);
        romanValues.put('M', 1000);

        int num = 0;
        for (int i = 0; i < s.length(); i++) {
            int value = romanValues.get(s.charAt(i));
            if(i < s.length() - 1 && value < romanValues.get(s.charAt(i + 1))){
                num -= value;
            } else {
                num += value;
            }
        }

        return num;
    }

    public static void main(String[] args) {

        String romNumber = "XIV";
        System.out.println(getNumber(romNumber));
    }
}
