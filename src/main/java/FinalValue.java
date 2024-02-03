public class FinalValue {

    /*
    https://leetcode.com/problems/final-value-of-variable-after-performing-operations/description/

     */

    public static int finalValueAfterOperations(String[] operations) {

        int l = operations.length;
        if (operations.length >= 1 && operations.length <= 100) {
            int result = 0;

        /*

        for (String operation : operations){
            if (operation.equals("X++") || operation.equals("++X")){
                result++;
            }
            if (operation.equals("X--") || operation.equals("--X")){
                result--;
            }
        }

        for (String operation : operations){
            switch (operation) {
                case "X++" -> result++;
                case "++X" -> ++result;
                case "X--" -> result--;
                case "--X" -> --result;
            }
        }
        */

            for (String operation : operations){
                char o = operation.charAt(1);
                if (o == '+'){
                    result++;
                } else if (o == '-'){
                    result--;
                }
            }

            return result;

        } else return 100;
    }

    public static void main(String[] args) {

        System.out.println(finalValueAfterOperations(new String[]{"--X","X++","X++"}));
        System.out.println(finalValueAfterOperations(new String[]{"++X","++X","X++"}));
        System.out.println(finalValueAfterOperations(new String[]{"X++","++X","--X","X--"}));
    }
}
