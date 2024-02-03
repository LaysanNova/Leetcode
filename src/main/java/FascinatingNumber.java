public class FascinatingNumber {
    public static boolean numberIsFascinating(int n){

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

    public static void main(String[] args) {

        System.out.println(numberIsFascinating(192));
        System.out.println(numberIsFascinating(100));
        System.out.println(numberIsFascinating(111));
        System.out.println(numberIsFascinating(783));
    }
}
