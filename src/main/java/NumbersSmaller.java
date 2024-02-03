import java.util.Arrays;

public class NumbersSmaller {

    public static int[] smallerNumbersThanCurrent(int[] nums) {

        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++){
            for (int number : nums){
                if (number < nums[i]){
                    result[i] += 1;
                }
            }
        }

        return result;
    }
    public static void main(String[] args) {

        System.out.println(Arrays.toString(smallerNumbersThanCurrent(new int[]{8,1,2,2,3})));
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(new int[]{6,5,4,8})));
        System.out.println(Arrays.toString(smallerNumbersThanCurrent(new int[]{7,7,7,7})));
    }
}