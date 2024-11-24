package leetcode;

public class MaximumProductSubarray {
    // Leetcode problem: 152. Maximum Product Subarray

    public static void main(String[] args) {

//        int[] nums = {2, 3, -2, -4};
//        int[] nums = {2, 3, -2, 4};
//        int[] nums = {2, 3, 0, -4};
//        int[] nums = {2, 0, -4};
//        int[] nums = {-2, 3, -4};
//        int[] nums = {3, -2, -1};
        int[] nums = {6, 0, 4};

        System.out.println(maxProduct(nums));

    }

    private static int maxProduct(int[] nums) {
        if (nums.length == 0) return 0;

        int maxProduct = nums[0];
        int minProduct = nums[0];
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int current = nums[i];

            int tempMax = Math.max(current, Math.max(maxProduct * current, minProduct * current));

            minProduct = Math.min(current, Math.min(maxProduct * current, minProduct * current));
            maxProduct = tempMax;

            result = Math.max(result, maxProduct);
        }

        return result;
    }
}
