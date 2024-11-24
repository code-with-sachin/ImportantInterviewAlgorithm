package leetcode;

public class RotatedSortedArray {
    //Leetcode problem: 33. Search in Rotated Sorted Array

    public static void main(String[] args) {
        int[] arr = {5, 6, 7, 8, 1, 2, 3, 4};
        int target = 3;

        int ans = search(arr, target);
        System.out.println(ans);
    }

    public static int search(int[] nums, int target) {
        //we will use binary search

        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = left + (right - left)/2;

            if (nums[mid] == target) return mid;

            if (nums[left] <= nums[mid]) {
                if (target < nums[mid] && nums[left] <= target) {
                    right = mid - 1;
                } else {
                    left = mid +1;
                }
            }
            else {
                if (target > nums[mid] && target <= nums[right]) {
                    left = mid + 1;
                } else {
                    right = mid - 1;
                }
            }
        }
        return -1;
    }
}
