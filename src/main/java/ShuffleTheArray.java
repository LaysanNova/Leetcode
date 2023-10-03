public class ShuffleTheArray {

    public int[] shuffle(int[] nums, int n) {

        int[] result = new int[nums.length];
        int k = 0;

        for (int i = 0; i < nums.length / 2; i++){

            result[k] = nums[i];
            result[k + 1] = nums[i + n];
            k += 2;
        }

        return result;
    }

//    public static void main(String[] args) {
//        System.out.println(Arrays.toString(shuffle(new int[]{2, 5, 1, 3, 4, 7}, 3)));
//        System.out.println(Arrays.toString(shuffle(new int[]{1,2,3,4,4,3,2,1}, 4)));
//        System.out.println(Arrays.toString(shuffle(new int[]{1,1,2,2}, 2)));
//
//    }
}
