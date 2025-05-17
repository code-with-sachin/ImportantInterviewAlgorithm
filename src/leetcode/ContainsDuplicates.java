package leetcode;

public class ContainsDuplicates {

    public static void main(String[] args) {
        int[] nums = {1,2,3,1};
        System.out.println(hasDuplicate(nums));
    }

    public static boolean hasDuplicate(int[] nums) {
        if(nums.length<=1){
            return false;
        }
        //brute force
        for(int i=0; i<nums.length-1; i++){
            for(int j=i+1; j<nums.length; j++){
                if(nums[i]==nums[j]){
                    return true;
                }
            }
        }
        return false;
    }
}
