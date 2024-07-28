/*
 * @lc app=leetcode id=35 lang=java
 *
 * [35] Search Insert Position
 */

// @lc code=start

class Solution {
    public int searchInsert(int[] nums, int target) {
        int l=0, r=nums.length-1;
        while(l<=r){
            int mid = l+ (r-l)/2;
            if(nums[mid]== target){
                return mid;
            }
            else if(nums[mid]<target){
                l=mid+1;
            }
            else
            {
                r=mid-1;
            }
            
        }
        return l;
    }
}
//equivalent to : search the first value in the array that equals to or bigger than the target 
//binary search with O（logn)
// the loop condition : <=   (not looking for a pair so it makes senese in the '=' case)
// @lc code=end

