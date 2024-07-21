/*
 * @lc app=leetcode id=209 lang=java
 *
 * [209] Minimum Size Subarray Sum
 */

// @lc code=start
class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        // Idenx of Pointers:l, r
        int l=0 , r=0;
        // Define sum and min_len of the arr
        int sum=0;
        int min_len=Integer.MAX_VALUE;
        //if the condition not met yet, r moves, otherweise l moves
        //condition: sum>=target
        // loop terminates: r pointer reachs the last index of array 
        int arr_len=nums.length;
        while(r<arr_len){
            //add the current element (move the r pointer at end of this iteration)
            sum+=nums[r];
            //contracts when the conditon is met
            while(sum>=target){
                //update the min_len
                min_len=Math.min(min_len, r-l+1);
                //when moving the l, first substract the current num[l] from the sum
                sum-=nums[l];
                l++;
            }
            r++;
            

        }
        //in the end, if the min_len does not change, not an expected subarray is found
        return min_len==Integer.MAX_VALUE? 0:min_len;

    }
}
// @lc code=end

