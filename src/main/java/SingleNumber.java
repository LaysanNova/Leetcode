/*
//https://leetcode.com/problems/single-number/description/

Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.

        You must implement a solution with a linear runtime complexity and use only constant extra space.



        Example 1:

        Input: nums = [2,2,1]
        Output: 1
        Example 2:

        Input: nums = [4,1,2,1,2]
        Output: 4
        Example 3:

        Input: nums = [1]
        Output: 1


        Constraints:

        1 <= nums.length <= 3 * 104
        -3 * 104 <= nums[i] <= 3 * 104
        Each element in the array appears twice except for one element which appears only once.

 */

import java.util.Arrays;

public class SingleNumber {

    public static int singleNumber(int[] nums) {

        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i = i + 2) {
            if (nums[i] != nums[i + 1]) {
                return nums[i];
            }
        }
        return nums[nums.length - 1];
    }

    public int singleNumber1(int[] nums) {
    int ans = 0;
        for(int i=0; i<nums.length; i++){
        ans^=nums[i];
    }
        return ans;
    }

    public static void main(String[] args) {

        System.out.println("a " + singleNumber(new int[] {2,2,1}));
        System.out.println("a " + singleNumber(new int[] {4,1,2,1,2}));
        System.out.println("a " + singleNumber(new int[] {1}));
    }
}
