public class FascinatingNumber {

    public boolean numberIsFascinating(int n){

//        String result = "";
//
//        for(int i = 1; i < 4; i++){
//            String newNumber = "" + n * i;
//            if(newNumber.contains( "0" )) {
//                return false;
//            }
//            result += newNumber;
//        }
//
//        if (result.length() > 9){
//            return false;
//        }
//
//        System.out.println(result);
//
//        for (int i = 1; i <= 9; i++){
//            if (!result.contains("" + i)){
//                return false;
//            }
//        }
//        return true;

        //***********************2
        boolean[] fascinating = new boolean[10];
        int n2 = 2 * n;
        int n3 = 3 * n;
        while(n > 0) {
            fascinating[n % 10] = true;
            fascinating[n2 % 10] = true;
            fascinating[n3 % 10] = true;

            n /= 10;
            n2 /= 10;
            n3 /= 10;
        }
        for(int i = 1; i < 10; i ++)
            if(! fascinating[i]) return false;
        return true;
    }

//    public static void main(String[] args) {
//        System.out.println(numberIsFascinating(192));
//        System.out.println(numberIsFascinating(100));
//        System.out.println(numberIsFascinating(111));
//        System.out.println(numberIsFascinating(783));
//    }
}
