//Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
//
//
//
//        Example 1:
//
//        Input: nums = [3,0,1]
//        Output: 2
//        Explanation: n = 3 since there are 3 numbers, so all numbers are in the range [0,3]. 2 is the missing number in the range since it does not appear in nums.
//        Example 2:
//
//        Input: nums = [0,1]
//        Output: 2
//        Explanation: n = 2 since there are 2 numbers, so all numbers are in the range [0,2]. 2 is the missing number in the range since it does not appear in nums.
//        Example 3:
//
//        Input: nums = [9,6,4,2,3,5,7,0,1]
//        Output: 8
//        Explanation: n = 9 since there are 9 numbers, so all numbers are in the range [0,9]. 8 is the missing number in the range since it does not appear in nums.
//
//
//        Constraints:
//
//        n == nums.length
//        1 <= n <= 104
//        0 <= nums[i] <= n
//        All the numbers of nums are unique.

import java.util.Arrays;

public class MissingNumber {

    public static int missingNumber(int[] nums) {

        int[] arr = new int[nums.length + 1];

        for (int i : nums){
            arr[i] = 1;
        }

        for (int i = 0; i < arr.length; i++){
            if (arr[i] == 0){
                return i;
            }
        }
        return -1;
    }

    public static int missingNumber1(int[] nums) {
        Arrays.sort(nums);

        for (int i = 0; i < nums.length; i++){
            if (i != nums[i]){
                return i;
            }
        }
        return nums.length;
    }

    public static void main(String[] args) {

        int[][] numbers = {{3, 0, 1}, {0, 1}, {9,6,4,2,3,5,7,0,1}};

        for (int[] i : numbers) {
            System.out.println(Arrays.toString(i) +" -> missing number is " + missingNumber(new int[] {3,0,1}));
            System.out.println(Arrays.toString(i) +" -> missing number is " + missingNumber1(new int[] {3,0,1} ) + "\n");
        }
    }
}
