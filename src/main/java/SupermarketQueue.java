import java.util.Arrays;

public class SupermarketQueue {

    public static int solveSuperMarketQueue(int[] customers, int n) {

        int[] checkouts = new int[n];

        for (int customer : customers){
            checkouts[0] += customer;
            Arrays.sort(checkouts);
        }

        System.out.println(Arrays.toString(checkouts));

        return checkouts[n - 1];
    }

    public static void main(String[] args) {

        System.out.println(solveSuperMarketQueue(new int[]{5,3,4}, 1));
        System.out.println(solveSuperMarketQueue(new int[]{10,2,3,3}, 2));
        System.out.println(solveSuperMarketQueue(new int[]{2,3,10}, 2));
        System.out.println(solveSuperMarketQueue(new int[]{109, 110, 100, 94, 105, 106, 106}, 7));
    }
}
