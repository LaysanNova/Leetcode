import java.util.*;

public class ThreeSum {

    /*
    https://leetcode.com/problems/3sum/

    Given an integer array nums, return all the triplets [nums[i], nums[j], nums[k]] such that i != j, i != k, and j != k, and nums[i] + nums[j] + nums[k] == 0.

    Notice that the solution set must not contain duplicate triplets.

    Example 1:

    Input: nums = [-1,0,1,2,-1,-4]
    Output: [[-1,-1,2],[-1,0,1]]
    Explanation:
    nums[0] + nums[1] + nums[2] = (-1) + 0 + 1 = 0.
    nums[1] + nums[2] + nums[4] = 0 + 1 + (-1) = 0.
    nums[0] + nums[3] + nums[4] = (-1) + 2 + (-1) = 0.
    The distinct triplets are [-1,0,1] and [-1,-1,2].
    Notice that the order of the output and the order of the triplets does not matter.
    Example 2:

    Input: nums = [0,1,1]
    Output: []
    Explanation: The only possible triplet does not sum up to 0.
    Example 3:

    Input: nums = [0,0,0]
    Output: [[0,0,0]]
    Explanation: The only possible triplet sums up to 0.


    Constraints:

            3 <= nums.length <= 3000
            -105 <= nums[i] <= 105

     */

    public static List<List<Integer>> threeSum(int[] nums) {

        if (nums.length < 3 || nums.length > 3000){
            return null;
        }

        long constraints = 100000;

        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);

         for (int i = 0; i < nums.length - 2; i++) {
            if (nums[i] < -constraints|| nums[i] > constraints ||
                    nums[i + 1] < -constraints || nums[i + 1] > constraints ||
                    nums[i + 2] < -constraints || nums[i + 2] > constraints
            )

             {
            return null;
            }

            for (int j = i + 1; j < nums.length - 1; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if (i != j && i != k && j != k  && nums[i] + nums[j] + nums[k] == 0){

                        List<Integer> template = Arrays.asList(nums[i], nums[j], nums[k]);

                        if (!result.contains(template)){
                            result.add(template);
                        }
                    }
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {

        int[][] numbers = {{-1, 0, 1, 2, -1, -4}, {-1, -1, 2}, {-1, 0, 1}};

        for (int[] i : numbers) {
            System.out.println(Arrays.toString(i) + " " + threeSum(i));
        }
    }
}
